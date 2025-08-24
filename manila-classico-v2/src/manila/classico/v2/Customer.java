/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manila.classico.v2;

/**
 *
 * @author theojohnsosa
 */
public class Customer {
    private String name;
    private String contact;
    private String reference;

    public Customer(String name, String contact, String reference) {
        this.name = name;
        this.contact = contact;
        this.reference = reference;
    }

    public String getName() { return name; }
    public String getContact() { return contact; }
    public String getReference() { return reference; }
}