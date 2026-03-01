
package stin01;


public class TruckDelivery extends ShippingMethod {

    @Override
    public double calcuateCost(double weight) {
        return 100 +10*weight;
    }
    
}
