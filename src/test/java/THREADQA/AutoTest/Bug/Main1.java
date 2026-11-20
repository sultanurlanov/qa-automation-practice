package THREADQA.AutoTest.Bug;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

       TestCase test1 = new TestCase(1,"Test1","PASSED");
       TestCase test2 = new TestCase(2,"Test2","FAILED");
       TestCase test3 = new TestCase(3,"Test3","FAILED");
       TestCase test4 = new TestCase(4,"Test4","PASSED");
       TestCase test5 = new TestCase(5,"Test5","FAILED");
       TestCase test6 = new TestCase(6,"Test6","PASSED");
       TestCase test7 = new TestCase(7,"Test7","FAILED");
       TestCase test8 = new TestCase(8,"Test8","PASSED");
       TestCase test9 = new TestCase(9,"Test9","PASSED");

       List<TestCase> tests = new ArrayList<>();
       tests.add(test1);
       tests.add(test2);
       tests.add(test3);
       tests.add(test4);
       tests.add(test5);
       tests.add(test6);
       tests.add(test7);
       tests.add(test8);
       tests.add(test9);

       int failedCount = countFailed(tests);
       int statusPassed = countByStatus(tests,"PASSED");
       int statusFailed = countByStatus(tests,"FAILED");

        System.out.println("Тестов упало: " + failedCount);
        System.out.println("Тест со статусом: " + statusPassed);
        System.out.println("Тест со статусом: " + statusFailed);


    }

    public static int countFailed(List<TestCase> tests) {
        int failedCount = 0;
        for (int i = 0; i < tests.size(); i++) {
            TestCase temp = tests.get(i);
            if (temp.getStatus().equals("FAILED")) {
                failedCount++;
            }
        }
        return failedCount;
    }

    public static int countByStatus(List<TestCase> tests, String status) {
        int countStatus = 0;
        for (TestCase test : tests) {
            if(test.getStatus().equals(status)) {
                countStatus++;
            }
        }
        return countStatus;
    }
}

