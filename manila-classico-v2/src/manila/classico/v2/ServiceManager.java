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
public class ServiceManager {
    private static final List<Service> services = new ArrayList<>();

    static {
        services.add(new Service("Haircut", 150));
        services.add(new Service("Haircut and Shampoo", 300));
        services.add(new Service("Haircut and Shave", 300));
        services.add(new Service("Haircut Delux", 300));
        services.add(new Service("Classico Signature", 300));
        services.add(new Service("Beard Trim", 300));
    }

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

    public static List<Service> searchServices(String keyword) {
        List<Service> result = new ArrayList<>();
        for (Service s : services) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(s);
            }
        }
        return result;
    }
}