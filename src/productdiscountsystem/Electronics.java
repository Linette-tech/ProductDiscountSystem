
package productdiscountsystem;

public class Electronics extends Product {

    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return price * 0.95;
    }
}