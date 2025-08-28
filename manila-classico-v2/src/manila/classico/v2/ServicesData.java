package manila.classico.v2;

import java.util.ArrayList;
import java.util.List;

public class ServicesData {
    private static final List<Service> SERVICES = new ArrayList<>();

    public static boolean addService(String name, double price) {
        return SERVICES.add(new Service(name, price));
    }

    public static boolean removeService(String name) {
        return SERVICES.removeIf(s -> s.getName().equalsIgnoreCase(name));
    }

    public static boolean removeLastService() {
        if (!SERVICES.isEmpty()) {
            SERVICES.remove(SERVICES.size() - 1);
            return true;
        }
        return false;
    }

    public static List<Service> getServices() {
        return new ArrayList<>(SERVICES);
    }

    public static List<Service> searchServices(String query) {
        List<Service> results = new ArrayList<>();
        for (Service s : SERVICES) {
            if (s.getName().toLowerCase().contains(query.toLowerCase())) {
                results.add(s);
            }
        }
        return results;
    }
}