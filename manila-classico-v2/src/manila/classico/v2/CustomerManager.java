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
            for (Customer customer : customers) {
                if (reference.equals(customer.getReference())) return true;
            }
        }
        return false;
    }

    public static List<Customer> searchCustomers(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return getCustomers();
        }
        String lower = keyword.toLowerCase();
        synchronized (customers) {
            return customers.stream()
                .filter(customer -> customer.getName().toLowerCase().contains(lower)
                          || customer.getContact().toLowerCase().contains(lower)
                          || customer.getReference().toLowerCase().contains(lower))
                .collect(Collectors.toList());
        }
    }
}