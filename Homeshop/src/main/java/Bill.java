import java.util.HashMap;
import java.util.Map;

public class Bill {

    private Customer customer ;
    private HashMap<Product, Integer> products;

    public Bill(Customer customer, Map products) {
        this.customer = customer;
        this.products = products;
    }

    public void addProduct(Product product, Integer quantity) {
        products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }
}
