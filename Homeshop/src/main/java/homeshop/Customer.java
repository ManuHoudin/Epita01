package homeshop;

public class Customer {

    String fullname;
    String address;

    public Customer(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }
}
