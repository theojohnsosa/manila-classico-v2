package manila.classico.v2;

public class Customer {
    private String customerName;
    private String customerContact;
    private String customerReferenceNumber;

    public Customer(String customerName, String customerContact, String customerReferenceNumber) {
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerReferenceNumber = customerReferenceNumber;
    }

    public String getName() { 
        return customerName; 
    }
    
    public String getContact() { 
        return customerContact; 
    }
    
    public String getReference() { 
        return customerReferenceNumber; 
    }
}