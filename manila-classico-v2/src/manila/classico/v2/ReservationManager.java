package manila.classico.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReservationManager {
    private static final List<Reservation> reservations = Collections.synchronizedList(new ArrayList<>());
    
    public static void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
    
    public static List<Reservation> getReservations() {
        synchronized (reservations) {
            return new ArrayList<>(reservations);
        }
    }
    
    public static List<Reservation> searchReservations(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return getReservations();
        }
        
        String lower = keyword.toLowerCase();
        synchronized (reservations) {
            return reservations.stream().filter(r -> matchesKeyword(r, lower)).collect(Collectors.toList());
        }
    }
    
    public static double getTotalSales() {
        synchronized (reservations) {
            return reservations.stream().mapToDouble(ReservationManager::parseAmount).sum();
        }
    }
    
    public static long getScheduledCount() {
        String today = java.time.LocalDate.now().toString();
        synchronized (reservations) {
            return reservations.stream().filter(r -> r.getDate().compareTo(today) >= 0).count();
        }
    }
    
    private static boolean matchesKeyword(Reservation r, String keyword) {
        return r.getFullName().toLowerCase().contains(keyword) || r.getContactNumber().toLowerCase().contains(keyword) || r.getService().toLowerCase().contains(keyword) || r.getBarber().toLowerCase().contains(keyword);
    }
    
    private static double parseAmount(Reservation reservation) {
        try {
            return Double.parseDouble(reservation.getTotalAmount());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}