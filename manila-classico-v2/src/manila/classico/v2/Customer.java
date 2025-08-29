package manila.classico.v2;

public class Customer {
    private String name;
    private String contact;
    private String reference;

    public Customer(String name, String contact, String reference) {
        this.name = name;
        this.contact = contact;
        this.reference = reference;
    }

    public String getName() { 
        return name; 
    }
    
    public String getContact() { 
        return contact; 
    }
    
    public String getReference() { 
        return reference; 
    }
}