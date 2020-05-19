public class Main {

    public static void main(String[] args) {
        Product cafe = new Product("Philips XZE567", "Machine à café", 198.75);
        Product tv = new Television("SONY DCR2345XP", "Ecran OLED 4K", 1899.99, 48, "OLED");
        Fridge fridge = new Fridge("Philips BEC4565FR", "Frigo super froid", 759.12, 250, true);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon Paris");

        Bill bill = new Bill(customer);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

    }
}
