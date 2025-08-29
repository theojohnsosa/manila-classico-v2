package manila.classico.v2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

public class ReservationsData {

    private static final String[] COLS = {
        "Full Name",
        "Contact",
        "Service",
        "Barber",
        "Date",
        "Time",
        "Payment Method",
        "Total"
    };

    private static final DefaultTableModel TABLE_MODEL = new DefaultTableModel(COLS, 0) {
        @Override 
        public boolean isCellEditable(int r, int c) { 
            return false; 
        }
    };

    private static final List<Reservation> RES_LIST = new ArrayList<>();
    private static final Set<String> RES_KEYS = new HashSet<>();

    private static String norm(String s) {
        return s==null ? "" : s.trim().toLowerCase(Locale.ENGLISH); 
    }
    
    private static String keyOf(String fullName,String contact,String service,String barber,String date,String time) {
        return String.join("|", norm(fullName), norm(contact), norm(service), norm(barber), norm(date), norm(time));
    }

    public static synchronized boolean addReservation(String fullName, String contact, String service, String barber, String date, String time, String paymentMethod, String totalAmount) {
        String key = keyOf(fullName, contact, service, barber, date, time);
        
        if (RES_KEYS.contains(key)) {
            return false;
        }

        Reservation r = new Reservation(fullName, contact, service, barber, date, time, paymentMethod, totalAmount);
        RES_LIST.add(r);
        RES_KEYS.add(key);

        sortByDateTime();
        rebuildTableModel();

        return true;
    }

    public static synchronized boolean removeFirstReservation() {
        if (RES_LIST.isEmpty()) return false;
        Reservation removed = RES_LIST.remove(0);
        RES_KEYS.remove(keyOf(
            removed.getFullName(), 
            removed.getContactNumber(), 
            removed.getService(),
            removed.getBarber(), 
            removed.getDate(), 
            removed.getTime()
        ));
        rebuildTableModel();
        return true;
    }

    public static synchronized DefaultTableModel getTableModel() { return TABLE_MODEL; }

    public static synchronized List<Reservation> getReservations() {
        return new ArrayList<>(RES_LIST);
    }

    private static void rebuildTableModel() {
        TABLE_MODEL.setRowCount(0);
        for (Reservation r : RES_LIST) {
            TABLE_MODEL.addRow(new Object[]{
                r.getFullName(),
                r.getContactNumber(),
                r.getService(),
                r.getBarber(),
                r.getDate(),
                r.getTime(),
                r.getPaymentMethod(),
                r.getTotalAmount()
            });
        }
    }

    private static void sortByDateTime() {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd h:mm a", Locale.ENGLISH);
        RES_LIST.sort((a, b) -> {
            try {
                Date dateA = sdf.parse(a.getDate() + " " + a.getTime());
                Date dateB = sdf.parse(b.getDate() + " " + b.getTime());
                return dateA.compareTo(dateB);
            } catch (ParseException e) {
                return 0;
            }
        });
    }
}
