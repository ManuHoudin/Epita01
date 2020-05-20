import homeshop.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {

    private String output;
    private Writer writerMock = new Writer() {
        @Override
        public void start() {
            output = "";
        }

        @Override
        public void writeLine(String line) {
            output += line + "%n";
        }

        @Override
        public void stop() {
        }
    };

    private Product cafe = new Product("Philips XZE567", "Machine à café", 198.00);
    private Product tv = new Television("SONY DCR2345XP", "Ecran OLED 4K", 1900.00, 48, "OLED");
    private Fridge fridge = new Fridge("Philips BEC4565FR", "Frigo super froid", 760.00, 250, false);

    private Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon Paris");
    private Delivery delivery = new TakeAwayDelivery();

    @Test
    public void Given_2ProductsAndDelivery_When_generatingBill_Then_getGoodLineNumber() {
        Bill bill = new Bill(customer, delivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.generate(writerMock);
        int lineNumber = output.split("%n").length;
        assertEquals(20, lineNumber);
    }

    @Test
    public void Given_3ProductsAndDelivery_When_generatingBill_Then_getGoodTotal() {
        Bill bill = new Bill(customer, delivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        assertEquals(2858.00, bill.getTotal(), 0.01);
    }

    @Test
    public void Given_noProduct_When_generatingList_Then_throwsException(){
        Bill bill = new Bill(customer, delivery);
        assertThrows(NoProductBillException.class, () -> bill.generate(writerMock));
    }
}