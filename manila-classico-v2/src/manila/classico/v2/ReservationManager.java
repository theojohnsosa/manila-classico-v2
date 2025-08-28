/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manila.classico.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author theojohnsosa
 */
public class ReservationManager {
    private static final List<Reservation> reservations = Collections.synchronizedList(new ArrayList<>());

    public static void addReservation(Reservation r) {
        reservations.add(r);
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
                .filter(r -> r.getFullName().toLowerCase().contains(lower)
                          || r.getContactNumber().toLowerCase().contains(lower)
                          || r.getService().toLowerCase().contains(lower)
                          || r.getBarber().toLowerCase().contains(lower))
                .collect(Collectors.toList());
        }
    }

    public static double getTotalSales() {
        synchronized (reservations) {
            return reservations.stream()
                .mapToDouble(r -> {
                    try {
                        return Double.parseDouble(r.getTotalAmount());
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
                .filter(r -> r.getDate().compareTo(today) >= 0) // today or future
                .count();
        }
    }
}