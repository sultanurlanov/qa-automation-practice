package THREADQA.AutoTest;

import java.util.*;

public class TestRunner {

    private static Random random = new Random();

    static void main() {
        List<AutoTests> tests = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            tests.add(getRandomTest());
        }
        System.out.println(tests.size());

        int testCount = tests.size();

        for (int i = 1; i <= 100; i++) {
            int randomIndex = random.nextInt(tests.size());
            AutoTests tempTest = tests.get(randomIndex);
            tempTest.randomResult();

            if (i % 20 == 0) {
                tests.add(getRandomTest());
                System.out.println("Добавлен новый тест");
            }
        }
        System.out.println("Было тестов: " + testCount);
        System.out.println("Стало тестов: " + tests.size());

        Map<String, Integer> testCounts = new HashMap<>();
        for (AutoTests autoTests : tests) {
            String className = autoTests.getClass().getSimpleName();
            testCounts.put(className, testCounts.getOrDefault(className, 0) + 1);

        }

        for (String className : testCounts.keySet()){
            int count = testCounts.get(className);
            System.out.println(className + " : " + count);
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

