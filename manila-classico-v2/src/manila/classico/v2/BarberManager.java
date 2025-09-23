package manila.classico.v2;

import java.util.ArrayList;
import java.util.List;

public class BarberManager {
    private static final List<Barber> barbers = new ArrayList<>();

    static {
        barbers.add(new Barber("Carlos Mendoza", "09123456789", "carlosmendoza@email.com", new java.util.Date()));
        barbers.add(new Barber("Roberto Silva", "09234567890", "robertosilva@email.com", new java.util.Date()));
        barbers.add(new Barber("Raffy Tulfo", "09345678901", "raffytulfo@email.com", new java.util.Date()));
    }

    public static List<Barber> getBarbers() { 
        return barbers; 
    }
    
    public static boolean removeBarber(String barberName) {
    return barbers.removeIf(barber -> barber.getName().equalsIgnoreCase(barberName));
}
    public static void addBarber(Barber barber) { 
        barbers.add(barber); 
    }
    
    public static void removeBarber(Barber barber) { 
        barbers.remove(barber); 
    }
    
    public static void removeLastBarber() { 
        if (!barbers.isEmpty()) barbers.remove(barbers.size() - 1); 
    }

    public static List<Barber> searchBarbers(String keyword) {
        List<Barber> result = new ArrayList<>();
        for (Barber barber : barbers) {
            if (barber.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(barber);
            }
        }
        return result;
    }
}