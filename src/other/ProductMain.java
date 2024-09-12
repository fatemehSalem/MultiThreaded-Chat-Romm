package other;

public class ProductMain {
    public static void main(String[] args) {
        // Client code
        Product product = ProductFactory.createProduct("C");
        product.use();
    }


}
