public class Product {

    String name;
    String description;
    double price;

    public Product(Object o, Object o1, String name, Object o2) {
    }

    public Product(String name, String description, double price) {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void look() {
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    public void buy(Bill bill, Integer quantity) {
    }
}
