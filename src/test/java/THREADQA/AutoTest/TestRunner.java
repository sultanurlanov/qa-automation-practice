package THREADQA.AutoTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestRunner {

    private static Random random = new Random();

    static void main() {
        List<AutoTests> tests = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            tests.add(getRandomTest());
        }
        System.out.println(tests.size());

        for(int i = 1; i <= 100; i++){
        int randomIndex = random.nextInt(tests.size());
        AutoTests tempTest = tests.get(randomIndex);
        tempTest.randomResult();

        if (i % 20 == 0){
            tests.add(getRandomTest());
            System.out.println("Добавлен новый тест");
        }
        }
    }

   public static AutoTests getRandomTest() {
       int randomNumber = random.nextInt(3);

      AutoTests test = switch (randomNumber) {
           case 0 -> new ApiTest();
           case 1 -> new UiTest();
           case 2 -> new DbTest();
          default -> throw new IllegalStateException("Неизвестный номер " + randomNumber);
       };
       return test;
   }

}

