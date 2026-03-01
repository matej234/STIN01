
package stin01;

public abstract class Delivery {
    protected String TrackingNumber;
    public double weight;
    
    public Delivery(String number, double weight){
        this.TrackingNumber = number;
        this.weight = weight;
    }
    
    public abstract double calculatePrice();
}
