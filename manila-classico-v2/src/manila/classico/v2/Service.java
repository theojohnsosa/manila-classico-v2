package manila.classico.v2;

public class Service {
    private String serviceName;
    private double servicePrice;

    public Service(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public String getName() {
        return serviceName;
    }

    public double getPrice() {
        return servicePrice;
    }
}
