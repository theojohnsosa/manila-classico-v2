package manila.classico.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerManager {
    private static final List<Customer> customers = Collections.synchronizedList(new ArrayList<>());
    
    public static void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public static List<Customer> getCustomers() {
        synchronized (customers) {
            return new ArrayList<>(customers);
        }
    }
    
    public static boolean referenceExists(String reference) {
        if (reference == null) return false;
        synchronized (customers) {
            return customers.stream().anyMatch(c -> reference.equals(c.getCustomerReferenceNumber()));
        }
    }
    
    public static List<Customer> searchCustomers(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return getCustomers();
        }
        
        String lower = keyword.toLowerCase();
        synchronized (customers) {
            return customers.stream().filter(c -> c.getCustomerName().toLowerCase().contains(lower) || c.getCustomerContact().toLowerCase().contains(lower) || c.getCustomerReferenceNumber().toLowerCase().contains(lower)).collect(Collectors.toList());
        }
    }
}