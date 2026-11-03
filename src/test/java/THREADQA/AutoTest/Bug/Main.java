package THREADQA.AutoTest.Bug;

public class Main {

    public static void main(String[] args) {

        TestCase testCaseLogin = new TestCase(1,"Login","PASSED");
        TestCase testCaseRegistration = new TestCase(2,"Registration","FAILED");
        TestCase testCaseEmail = new TestCase(10,"Email","FAILED");
        TestCase testCasePassword = new TestCase(8,"Password","PASSED");


        Bug bug1 = new Bug("ErorrPassword","MAJOR",2);
        Bug bug2 = new Bug("NotFound","MINOR",3);
        Bug bug3 = new Bug("Server500","BLOCKER",1);

        System.out.println(testCaseLogin.getName());
        System.out.println(testCaseRegistration.getStatus());
        System.out.println(testCaseEmail.getId());
        System.out.println(testCasePassword.getId());

        System.out.println(bug1.getTitle() + " - " + bug1.getSeverity());
        System.out.println(bug2.getTitle() + " - " + bug2.getSeverity());
        System.out.println(bug3.getTitle() + " - " + bug3.getSeverity());
    }

}
