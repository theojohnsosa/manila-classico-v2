package manila.classico.v2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a", Locale.ENGLISH);
    
    public static synchronized Reservation getLatestReservation() {
        if (RES_LIST.isEmpty()) return null;
        return RES_LIST.get(RES_LIST.size() - 1);
    }
    
    private static final DefaultTableModel TABLE_MODEL = new DefaultTableModel(COLS, 0) {
        @Override 
        public boolean isCellEditable(int r, int c) { 
            return false; 
        }
    };
    
    private static final DefaultTableModel SALES_TABLE_MODEL = new DefaultTableModel(COLS, 0) {
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
    
    private static String keyOf(String fullName,String contact,String service,String barber,String date,String time, String paymentRendered, String totalAmount) {
        return String.join("|", norm(fullName), norm(contact), norm(service), norm(barber), norm(date), norm(time), norm(paymentRendered), norm(totalAmount));
    }
    
    public static boolean isValidFutureDateTime(String date, String time) {
        try {
            LocalDate reservationDate = LocalDate.parse(date, DATE_FORMATTER);
            LocalDate today = LocalDate.now();
            
            if (reservationDate.isAfter(today)) {
                return true;
            }
            
            if (reservationDate.isEqual(today)) {
                String dateTimeStr = date + " " + time;
                LocalDateTime reservationDateTime = LocalDateTime.parse(dateTimeStr, DATETIME_FORMATTER);
                LocalDateTime now = LocalDateTime.now();
                return reservationDateTime.isAfter(now);
            }
            
            return false;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public static synchronized boolean addReservation(String fullName, String contact, String service, String barber, String date, String time, String paymentMethod, String totalAmount, String paymentRendered) {
        
        String key = keyOf(fullName, contact, service, barber, date, time,totalAmount ,paymentRendered );
        
        if (RES_KEYS.contains(key)) {
            return false;
        }
        
        Reservation r = new Reservation(fullName, contact, service, barber, date, time, paymentMethod, totalAmount, paymentRendered);
        RES_LIST.add(r);
        RES_KEYS.add(key);
        sortByDateTime();
        rebuildTableModel();
        rebuildSalesTableModel();
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
            removed.getTime(),
            removed.getPaymentRendered(),
            removed.getTotalAmount()
        ));
        rebuildTableModel();
        rebuildSalesTableModel();
        return true;
    }
    
    public static synchronized DefaultTableModel getTableModel() { 
        rebuildTableModel();
        return TABLE_MODEL; 
    }
    
    public static synchronized DefaultTableModel getSalesTableModel() { 
        rebuildSalesTableModel();
        return SALES_TABLE_MODEL; 
    }
    
    public static synchronized List<Reservation> getReservations() {
        return new ArrayList<>(RES_LIST);
    }
    
    public static synchronized List<Reservation> getFutureReservations() {
        List<Reservation> futureReservations = new ArrayList<>();
        for (Reservation reservation : RES_LIST) {
            if (isValidFutureDateTime(reservation.getDate(), reservation.getTime())) {
                futureReservations.add(reservation);
            }
        }
        return futureReservations;
    }
    private static void rebuildTableModel() {
        TABLE_MODEL.setRowCount(0);
        
        List<Reservation> futureReservations = getFutureReservations();
        
        for (Reservation reservation : futureReservations) {
            TABLE_MODEL.addRow(new Object[]{
                reservation.getFullName(),
                reservation.getContactNumber(),
                reservation.getService(),
                reservation.getBarber(),
                reservation.getDate(),
                reservation.getTime(),
                reservation.getPaymentMethod(),
                reservation.getTotalAmount()
            });
        }
    }
    
    private static void rebuildSalesTableModel() {
        SALES_TABLE_MODEL.setRowCount(0);
        
        for (Reservation reservation : RES_LIST) {
            SALES_TABLE_MODEL.addRow(new Object[]{
                reservation.getFullName(),
                reservation.getContactNumber(),
                reservation.getService(),
                reservation.getBarber(),
                reservation.getDate(),
                reservation.getTime(),
                reservation.getPaymentRendered(),
                reservation.getTotalAmount()
            });
        }
    }
     public static synchronized boolean removeReservation(Reservation reservation) {
        String key = keyOf(
            reservation.getFullName(),
            reservation.getContactNumber(),
            reservation.getService(),
            reservation.getBarber(),
            reservation.getDate(),
            reservation.getTime(),
            reservation.getTotalAmount(),
            reservation.getPaymentRendered()
            
            
        );
        
        if (RES_LIST.remove(reservation)) {
            RES_KEYS.remove(key);
            rebuildTableModel();
            rebuildSalesTableModel();
            return true;
        }
        return false;
    }
    
    private static void sortByDateTime() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd h:mm a", Locale.ENGLISH);
        RES_LIST.sort((a, b) -> {
            try {
                Date dateA = simpleDateFormat.parse(a.getDate() + " " + a.getTime());
                Date dateB = simpleDateFormat.parse(b.getDate() + " " + b.getTime());
                return dateA.compareTo(dateB);
            } catch (ParseException e) {
                return 0;
            }
        });
    }
    
    
}

