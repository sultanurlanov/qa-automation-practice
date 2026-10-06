package THREADQA;

public class Main {

    public static void main(String[] args) {
//        String name = "Max";
//        int age = 30;
//        System.out.println(name);
//        name = concatNameAge(name, age);
//        System.out.println(name);
//        int result = sum(age,2);
//        System.out.println(result);
//        sayHello();
//        sayMethod(name);

//        Car car = new Car("Audi",200);
//        car.beeepBeep();
//        car.goToRoad();
//        System.out.println(car.getModel());
//
//        Car car1 = new Car("Mazda",5);
//        car1.setModel("BMW");
//        car1.setFuel(10);
//        car1.goToRoad();
//        System.out.println(car1.getModel());


        Car car = new Car("Lexus",50);
        car.beeepBeep();
        car.goToRoad();
        car.goToRoad();
        car.goToRoad();
    }



    public static void sayMethod(String name) {
        String result = concatNameAge(name,32);
        System.out.println(result);
    }

    public static void sayHello() {
        System.out.println("Привет мир!!!");
    }

    public static String concatNameAge(String nameToConcat, int ageToConcat) {
        String result = nameToConcat + " " + ageToConcat;
        result = result.toUpperCase();
        return result;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
