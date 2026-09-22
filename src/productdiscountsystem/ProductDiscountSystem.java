
package productdiscountsystem;

public class ProductDiscountSystem {

    public static void main(String[] args) {

        Product[] products = {
            new Clothing("T-Shirt", 200),
            new Clothing("Jeans", 500),
            new Electronics("Laptop", 10000),
            new Electronics("Phone", 5000)
        };

        for (Product product : products) {
            System.out.println("Product: " + product.name);
            System.out.println("Original Price: R" + product.price);
            System.out.println("Discounted Price: R"
                    + product.getDiscountedPrice());
            System.out.println("------------------------");
        }
    }
}