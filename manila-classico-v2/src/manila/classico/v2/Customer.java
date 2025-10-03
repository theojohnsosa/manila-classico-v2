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
    
    public String getCustomerName() { 
        return customerName; 
    }
    
    public String getCustomerContact() { 
        return customerContact; 
    }
    
    public String getCustomerReferenceNumber() { 
        return customerReferenceNumber; 
    }
}