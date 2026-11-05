package THREADQA.AutoTest.Product;


public class Order {

    private int id;
    private String customer;
    private int total;
    private String status;

    public Order(int id, String customer, int total, String status) {
        this.id = id;
        this.customer = customer;
        this.total = total;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public int getTotal() {
        return total;
    }

    public String getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

}
