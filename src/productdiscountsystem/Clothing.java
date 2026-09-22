
package productdiscountsystem;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return price * 0.90;
    }
}