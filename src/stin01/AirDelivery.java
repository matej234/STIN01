
package stin01;


public class AirDelivery extends ShippingMethod {

    @Override
    public double calcuateCost(double weight) {
        return 300 + 25*weight;
    }
    
}
