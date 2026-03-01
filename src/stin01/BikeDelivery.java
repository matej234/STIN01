
package stin01;


public class BikeDelivery extends ShippingMethod {

    @Override
    public double calculateCost(double weight) {
            if(weight >= 5){
                throw new IllegalArgumentException("Na tuto dopravu mate moc tezky balik!");
            }
            return 80;
    }
    
}
