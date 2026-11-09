package THREADQA.AutoTest.Bug;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TestCase test1 = new TestCase(1,"Login","PASSED");
        TestCase test2 = new TestCase(2,"Password","FAILED");
        TestCase test3 = new TestCase(3,"Email","SKIPPED");
        TestCase test4 = new TestCase(4,"Cart","FAILED");

        List<TestCase> tests = new ArrayList<>();
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        tests.add(test4);

        for (TestCase test : tests) {
            if (test.getStatus().equals("FAILED")) {
                System.out.println(test.getId() + " - " + test.getTitle() + " - " + test.getStatus());
            }
        }
    }
}

