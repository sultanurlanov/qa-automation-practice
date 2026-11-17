package THREADQA.AutoTest.Bug;

import java.util.ArrayList;
import java.util.List;

public class Report {

    public static void main(String[] args) {

        TestCase test1 = new TestCase(1,"Test1","500");
        TestCase test2 = new TestCase(2,"Test2","500");
        TestCase test3 = new TestCase(3,"Test3","200");
        TestCase test4 = new TestCase(4,"Test4","201");
        TestCase test5 = new TestCase(5,"Test5","400");
        TestCase test6 = new TestCase(6,"Test6","500");
        TestCase test7 = new TestCase(7,"Test7","400");
        TestCase test8 = new TestCase(8,"Test8","200");
        TestCase test9 = new TestCase(9,"Test9","500");
        TestCase test10 = new TestCase(10,"Test10","200");

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
        tests.add(test10);

        int failedCount = contFailed(tests);
        int statusCount = countByStatus(tests,"400");

        System.out.println("Упало тестов: " + failedCount);
        System.out.println("400: " + statusCount);





    }

    public static int contFailed(List<TestCase> tests) {
        int failedCount = 0;
        for (TestCase test : tests) {
            if (test.getStatus().equals("500") || test.getStatus().equals("400")){
                failedCount++;
            }
        }
        return failedCount;
    }

    public static int countByStatus(List<TestCase> tests,String status) {
        int statusCount = 0;
        for (TestCase test : tests) {
            if(test.getStatus().equals(status)){
                statusCount++;
            }
        }
        return statusCount;
    }
}
