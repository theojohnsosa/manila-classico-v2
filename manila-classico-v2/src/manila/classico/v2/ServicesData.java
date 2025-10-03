package manila.classico.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServicesData {
    private static final List<Service> SERVICES = new ArrayList<>();

    public static void addService(String name, double price) {
        SERVICES.add(new Service(name, price));
    }

    public static boolean removeService(String name) {
        return SERVICES.removeIf(s -> s.getServiceName().equalsIgnoreCase(name));
    }

    public static boolean removeLastService() {
        return !SERVICES.isEmpty() && SERVICES.remove(SERVICES.size() - 1) != null;
    }

    public static List<Service> getServices() {
        return List.copyOf(SERVICES);
    }

    public static List<Service> searchServices(String query) {
        String q = query.toLowerCase();
        return SERVICES.stream().filter(s -> s.getServiceName().toLowerCase().contains(q)).collect(Collectors.toList());
    }
}