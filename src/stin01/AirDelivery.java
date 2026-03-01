
package stin01;


public class AirDelivery extends ShippingMethod {

    @Override
    public double calculateCost(double weight) {
        return 300 + 25*weight;
    }
    
}
