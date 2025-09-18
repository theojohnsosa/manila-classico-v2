package manila.classico.v2;

public class Reservation {
    private String fullName;
    private String contactNumber;
    private String service;
    private String barber;
    private String date;
    private String time;
    private String paymentMethod;
    private String totalAmount;
    private String paymentRendered;

    public Reservation(String fullName, String contactNumber, String service, String barber, String date, String time, String paymentMethod, String totalAmount, String paymentRendered) {
        this.fullName = fullName;
        this.contactNumber = contactNumber;
        this.service = service;
        this.barber = barber;
        this.date = date;
        this.time = time;
        this.paymentMethod = paymentMethod;
        this.totalAmount = totalAmount;
        this.paymentRendered = paymentRendered;
    }

    public String getFullName() { 
        return fullName; 
    }
    
    public String getContactNumber() { 
        return contactNumber; 
    }
    
    public String getService() { 
        return service; 
    }
    
    public String getBarber() { 
        return barber; 
    }
    
    public String getDate() { 
        return date; 
    }
    
    public String getTime() {
        return time; 
    }
    
    public String getPaymentMethod() { 
        return paymentMethod; 
    }
    
    public String getTotalAmount() {
        return totalAmount; 
    }
    public String getPaymentRendered() {
        return paymentRendered; 
    }
}
