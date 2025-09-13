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
            return reservations.stream()
                .filter(reservation -> reservation.getFullName().toLowerCase().contains(lower)
                          || reservation.getContactNumber().toLowerCase().contains(lower)
                          || reservation.getService().toLowerCase().contains(lower)
                          || reservation.getBarber().toLowerCase().contains(lower))
                .collect(Collectors.toList());
        }
    }

    public static double getTotalSales() {
        synchronized (reservations) {
            return reservations.stream()
                .mapToDouble(reservation -> {
                    try {
                        return Double.parseDouble(reservation.getTotalAmount());
                    } catch (NumberFormatException e) {
                        return 0;
                    }
                })
                .sum();
        }
    }

    public static long getScheduledCount() {
        String today = java.time.LocalDate.now().toString();
        synchronized (reservations) {
            return reservations.stream()
                .filter(reservation -> reservation.getDate().compareTo(today) >= 0)
                .count();
        }
    }
}