package THREADQA.AutoTest.Bug;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        TestCase test1 = new TestCase(1, "Test1", "200");
        TestCase test2 = new TestCase(2, "Test2", "500");
        TestCase test3 = new TestCase(3, "Test3", "200");
        TestCase test4 = new TestCase(4, "Test4", "500");
        TestCase test5 = new TestCase(5, "Test5", "200");


        List<TestCase> tests = new ArrayList<>();
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        tests.add(test4);
        tests.add(test5);

        int statusCount200 = countsByStatus(tests, "200");
        int statusCount500 = countsByStatus(tests, "500");

        System.out.println(statusCount200);
        System.out.println(statusCount500);
    }

    public static int countsByStatus(List<TestCase> tests, String status) {
        int statusCount = 0;
        for (TestCase test : tests) {
            if (test.getStatus().equals(status)) {
                statusCount++;
            }
        }
        return statusCount;
    }
}

