package THREADQA;

public class StreamsClassExample {

    public static void main(String[] args) {
        CarWithEnum lexus = new CarWithEnum("lexus", TypeCar.CROSSOVER,"black",4);

        if (lexus.getType().equals(TypeCar.HATCHBACK)) {
            System.out.println("error");
        } else {
            System.out.println("success ");
        }
    }
}
