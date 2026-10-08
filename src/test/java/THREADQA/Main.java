package THREADQA;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[3];

        cars[0] = new Car("Lexus",80);
        cars[1] = new Car("Tayota",50);
        cars[2] = new Car("Tesla",0);

        for (int i = 0; i < cars.length; i++) {

            Car tempCar = cars[i];

            if (tempCar.getModel().equals("Tesla")) {
                System.out.println(tempCar + " это электро мобиль");
                break;
            }
            System.out.println(cars[i]);
        }


        System.out.println(cars[0].getModel());
    }
}
