/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manila.classico.v2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author theojohnsosa
 */
public class BarberManager {
    private static final List<Barber> barbers = new ArrayList<>();

    static {
        barbers.add(new Barber("Carlos Mendoza", "09123456789", "carlos@example.com", new java.util.Date()));
        barbers.add(new Barber("Roberto Silva", "09234567890", "roberto@example.com", new java.util.Date()));
        barbers.add(new Barber("Raffy Tulfo", "09345678901", "raffy@example.com", new java.util.Date()));
    }

    public static List<Barber> getBarbers() { return barbers; }
    public static void addBarber(Barber b) { barbers.add(b); }
    public static void removeBarber(Barber b) { barbers.remove(b); }
    public static void removeLastBarber() { if (!barbers.isEmpty()) barbers.remove(barbers.size() - 1); }

    public static List<Barber> searchBarbers(String keyword) {
        List<Barber> result = new ArrayList<>();
        for (Barber b : barbers) {
            if (b.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(b);
            }
        }
        return result;
    }
}