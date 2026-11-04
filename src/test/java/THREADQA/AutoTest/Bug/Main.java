package THREADQA.AutoTest.Bug;

public class Main {

    public static void main(String[] args) {

      Bug bugErrorLogin = new Bug("ErrorLogin","MAJOR",1);
      Bug bugErrorPassword = new Bug("ErrorPassword","MINOR",2);
      Bug bugErrorServer = new Bug("ErrorServer","BLOCKER",3);

        System.out.println(bugErrorLogin.getTitle() + ": " + bugErrorLogin.getSeverity());
        System.out.println(bugErrorPassword.getTitle() + ": " + bugErrorPassword.getSeverity());
        System.out.println(bugErrorServer.getTitle() + ": " + bugErrorServer.getSeverity());
    }
}

