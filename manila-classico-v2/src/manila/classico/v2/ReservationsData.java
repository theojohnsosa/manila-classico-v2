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
    
    private static final String[] COLS = {"Full Name", "Contact", "Service", "Barber", "Date", "Time", "Payment Method", "Total"};
    
    private static final SimpleDateFormat DATETIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd h:mm a", Locale.ENGLISH);
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a", Locale.ENGLISH);
    
    private static final DefaultTableModel TABLE_MODEL = createNonEditableTableModel();
    private static final DefaultTableModel SALES_TABLE_MODEL = createNonEditableTableModel();
    
    private static final List<Reservation> RES_LIST = new ArrayList<>();
    private static final Set<String> RES_KEYS = new HashSet<>();
    private static final Set<String> COMPLETED_RESERVATION_KEYS = new HashSet<>();
    
    private static Reservation lastAddedReservation = null;
    
    private static DefaultTableModel createNonEditableTableModel() {
        return new DefaultTableModel(COLS, 0) {
            @Override 
            public boolean isCellEditable(int r, int c) { 
                return false; 
            }
        };
    }
    
    private static String keyOf(Reservation r) {
        return keyOf(r.getFullName(), r.getContactNumber(), r.getService(), r.getBarber(), r.getDate(), r.getTime(), r.getPaymentRendered(), r.getTotalAmount());
    }
    
    private static String keyOf(String fullName, String contact, String service, String barber, String date, String time, String paymentRendered, String totalAmount) {
        return String.join("|", norm(fullName), norm(contact), norm(service), norm(barber), norm(date), norm(time), norm(paymentRendered), norm(totalAmount));
    }
    
    private static String norm(String s) {
        return s == null ? "" : s.trim().toLowerCase(Locale.ENGLISH); 
    }
    
    public static boolean isValidFutureDateTime(String date, String time) {
        try {
            LocalDate reservationDate = LocalDate.parse(date, DATE_FORMATTER);
            LocalDate today = LocalDate.now();
            
            if (reservationDate.isAfter(today)) return true;
            if (reservationDate.isBefore(today)) return false;
            
            LocalDateTime reservationDateTime = LocalDateTime.parse(date + " " + time, DATETIME_FORMATTER);
            return reservationDateTime.isAfter(LocalDateTime.now());
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public static synchronized boolean addReservation(String fullName, String contact, String service, String barber, String date, String time, String paymentMethod, String totalAmount, String paymentRendered) {
        String key = keyOf(fullName, contact, service, barber, date, time, paymentRendered, totalAmount);
        
        if (RES_KEYS.contains(key)) return false;
        
        Reservation r = new Reservation(fullName, contact, service, barber, date, time, paymentMethod, totalAmount, paymentRendered);
        RES_LIST.add(r);
        RES_KEYS.add(key);
        lastAddedReservation = r;
        
        sortByDateTime();
        rebuildBothTables();
        return true;
    }
    
    public static synchronized Reservation getLastAddedReservation() {
        return lastAddedReservation;
    }
    
    public static synchronized Reservation getLatestReservation() {
        if (RES_LIST.isEmpty()) return null;

        Reservation latest = RES_LIST.get(0);
        try {
            Date latestDate = DATETIME_FORMAT.parse(latest.getDate() + " " + latest.getTime());

            for (Reservation r : RES_LIST) {
                Date currentDate = DATETIME_FORMAT.parse(r.getDate() + " " + r.getTime());
                if (currentDate.after(latestDate)) {
                    latest = r;
                    latestDate = currentDate;
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return latest;
    }
    
    public static synchronized boolean removeFirstReservation() {
        for (Reservation r : RES_LIST) {
            if (isUncompleted(r) && isValidFutureDateTime(r.getDate(), r.getTime())) {
                COMPLETED_RESERVATION_KEYS.add(keyOf(r));
                rebuildTableModel();
                return true;
            }
        }
        return false;
    }
    
    public static synchronized boolean removeReservationByIndex(int tableIndex) {
        List<Reservation> futureReservations = getFutureReservations();
        
        if (tableIndex < 0 || tableIndex >= futureReservations.size()) return false;
        
        Reservation toComplete = futureReservations.get(tableIndex);
        COMPLETED_RESERVATION_KEYS.add(keyOf(toComplete));
        rebuildTableModel();
        return true;
    }
    
    public static synchronized boolean removeReservation(Reservation reservation) {
        String key = keyOf(reservation);
        
        if (RES_LIST.remove(reservation)) {
            RES_KEYS.remove(key);
            COMPLETED_RESERVATION_KEYS.remove(key);
            rebuildBothTables();
            return true;
        }
        return false;
    }
    
    public static synchronized boolean isSlotTaken(String barber, String date, String time) {
        return RES_LIST.stream().anyMatch(r -> r.getBarber().equalsIgnoreCase(barber) && r.getDate().equals(date) && r.getTime().equalsIgnoreCase(time) && isUncompleted(r));
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
        for (Reservation r : RES_LIST) {
            if (isValidFutureDateTime(r.getDate(), r.getTime()) && isUncompleted(r)) {
                futureReservations.add(r);
            }
        }
        return futureReservations;
    }
    
    private static boolean isUncompleted(Reservation r) {
        return !COMPLETED_RESERVATION_KEYS.contains(keyOf(r));
    }
    
    private static void rebuildTableModel() {
        TABLE_MODEL.setRowCount(0);
        for (Reservation r : getFutureReservations()) {
            TABLE_MODEL.addRow(createRow(r));
        }
    }
    
    private static void rebuildSalesTableModel() {
        SALES_TABLE_MODEL.setRowCount(0);
        for (Reservation r : RES_LIST) {
            SALES_TABLE_MODEL.addRow(createRow(r));
        }
    }
    
    private static void rebuildBothTables() {
        rebuildTableModel();
        rebuildSalesTableModel();
    }
    
    private static Object[] createRow(Reservation r) {
        return new Object[]{
            r.getFullName(),
            r.getContactNumber(),
            r.getService(),
            r.getBarber(),
            r.getDate(),
            r.getTime(),
            r.getPaymentMethod(),
            r.getTotalAmount()
        };
    }
    
    private static void sortByDateTime() {
        RES_LIST.sort((a, b) -> {
            try {
                Date dateA = DATETIME_FORMAT.parse(a.getDate() + " " + a.getTime());
                Date dateB = DATETIME_FORMAT.parse(b.getDate() + " " + b.getTime());
                return dateB.compareTo(dateA);
            } catch (ParseException e) {
                return 0;
            }
        });
    }
}