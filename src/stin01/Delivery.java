
package stin01;

public class Delivery {
    protected String TrackingNumber;
    public double weight;
    private ShippingMethod ShippingMethod;
    
    public Delivery(String number, double weight, ShippingMethod shippingMethod){
        this.TrackingNumber = number;
        this.weight = weight;
        this.ShippingMethod = shippingMethod;
    }
    
    public double calculatePrice() {
        return ShippingMethod.calculateCost(weight);
    }
}
