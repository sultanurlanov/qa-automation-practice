package THREADQA.AutoTest.Bug;

public class RunTest {

    static void main(String[] args) {

        TestCase testCase = new TestCase(1,"login","PASSED");
        TestCase testCase5 = new TestCase(5,"login","Failed");

        System.out.println(testCase.getStatus());
        System.out.println(testCase5.getId() + testCase5.getName() + testCase5.getStatus());
    }
}
