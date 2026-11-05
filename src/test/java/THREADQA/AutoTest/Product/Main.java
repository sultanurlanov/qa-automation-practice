package THREADQA.AutoTest.Product;

public class Main {

    public static void main(String[] args) {

//        Product product1 = new Product("Куртка",5000,"SMALL");
//        Product product2 = new Product("Ботинки",4000,"MEDIUM");
//        Product product3 = new Product("Штаны",1500,"LARGE");
//
//        System.out.println(product1.getName() + " - " + product1.getPrice());
//        System.out.println(product2.getName() + " - " + product2.getPrice());
//

        Order order1 = new Order(1,"Max",101,"NEW");
        Order order2 = new Order(2,"Asel",102,"PAID");
        Order order3 = new Order(3,"Ulik",103,"CANCELLED");

        System.out.println(order1.getId() + " - " + order1.getCustomer() + " - " + order1.getStatus());
        System.out.println(order2.getId() + " - " + order2.getCustomer() + " - " + order2.getStatus());
        System.out.println(order3.getId() + " - " + order3.getCustomer() + " - " + order3.getStatus());
    }
}


