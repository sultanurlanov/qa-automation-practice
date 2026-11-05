package THREADQA.AutoTest.Product;

public class Product {

    private String name;
    private int price;
    private String size;

    public Product(String name, int price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

}
