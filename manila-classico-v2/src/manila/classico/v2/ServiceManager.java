package manila.classico.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceManager {
    private static final List<Service> services = new ArrayList<>(List.of(
        new Service("Haircut", 150),
        new Service("Haircut and Shampoo", 300),
        new Service("Haircut and Shave", 300),
        new Service("Haircut Delux", 300),
        new Service("Classico Signature", 300),
        new Service("Beard Trim", 300)
    ));

    public static List<Service> getServices() {
        return services;
    }

    public static void addService(Service service) {
        services.add(service);
    }

    public static void removeService(Service service) {
        services.remove(service);
    }

    public static void removeLastService() {
        if (!services.isEmpty()) {
            services.remove(services.size() - 1);
        }
    }
    
    public static boolean removeService(String serviceName) {
        return services.removeIf(s -> s.getServiceName().equalsIgnoreCase(serviceName));
    }

    public static List<Service> searchServices(String keyword) {
        String lower = keyword.toLowerCase();
        return services.stream().filter(s -> s.getServiceName().toLowerCase().contains(lower)).collect(Collectors.toList());
    }
}