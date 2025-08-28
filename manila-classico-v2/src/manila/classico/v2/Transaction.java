package manila.classico.v2;

public class Transaction {
    private final String customerName;
    private final String contact;
    private final String service;
    private final String barber;
    private final String date;
    private final String time;
    private final String paymentMethod;
    private final String paymentAmount;

    public Transaction(String customerName, String contact, String service, 
                       String barber, String date, String time, 
                       String paymentMethod, String paymentAmount) {
        this.customerName = customerName;
        this.contact = contact;
        this.service = service;
        this.barber = barber;
        this.date = date;
        this.time = time;
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
    }

    public String getCustomerName() { return customerName; }
    public String getContact() { return contact; }
    public String getService() { return service; }
    public String getBarber() { return barber; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getPaymentMethod() { return paymentMethod; }
    public String getPaymentAmount() { return paymentAmount; }
}