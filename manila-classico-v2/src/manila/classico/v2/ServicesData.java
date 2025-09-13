package manila.classico.v2;

import java.util.ArrayList;
import java.util.List;

public class ServicesData {
    private static final List<Service> SERVICES = new ArrayList<>();

    public static boolean addService(String serviceName, double servicePrice) {
        return SERVICES.add(new Service(serviceName, servicePrice));
    }

    public static boolean removeService(String name) {
        return SERVICES.removeIf(service -> service.getName().equalsIgnoreCase(name));
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
        for (Service service : SERVICES) {
            if (service.getName().toLowerCase().contains(query.toLowerCase())) {
                results.add(service);
            }
        }
        return results;
    }
}