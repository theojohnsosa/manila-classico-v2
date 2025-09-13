package manila.classico.v2;

public class Transaction {
    private final String customerName;
    private final String customerContact;
    private final String chosenService;
    private final String chosenBarber;
    private final String chosenDate;
    private final String chosenTime;
    private final String chosenPaymentMethod;
    private final String paymentAmount;

    public Transaction(String customerName, String customerContact, String chosenService, String chosenBarber, String chosenDate, String chosenTime, String chosenPaymentMethod, String paymentAmount) {
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.chosenService = chosenService;
        this.chosenBarber = chosenBarber;
        this.chosenDate = chosenDate;
        this.chosenTime = chosenTime;
        this.chosenPaymentMethod = chosenPaymentMethod;
        this.paymentAmount = paymentAmount;
    }

    public String getCustomerName() { 
        return customerName; 
    }
    
    public String getContact() { 
        return customerContact; 
    }
    
    public String getService() { 
        return chosenService; 
    }
    
    public String getBarber() { 
        return chosenBarber; 
    }
    
    public String getDate() { 
        return chosenDate; 
    }
    
    public String getTime() { 
        return chosenTime; 
    }
    
    public String getPaymentMethod() { 
        return chosenPaymentMethod; 
    }
    
    public String getPaymentAmount() { 
        return paymentAmount; 
    }
}