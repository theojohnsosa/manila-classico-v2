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
public class CustomerManager {
    private static final List<Customer> customers = Collections.synchronizedList(new ArrayList<>());

    public static void addCustomer(Customer c) {
        customers.add(c);
    }

    public static List<Customer> getCustomers() {
        synchronized (customers) {
            return new ArrayList<>(customers);
        }
    }

    public static boolean referenceExists(String ref) {
        if (ref == null) return false;
        synchronized (customers) {
            for (Customer c : customers) {
                if (ref.equals(c.getReference())) return true;
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
                .filter(c -> c.getName().toLowerCase().contains(lower)
                          || c.getContact().toLowerCase().contains(lower)
                          || c.getReference().toLowerCase().contains(lower))
                .collect(Collectors.toList());
        }
    }
}