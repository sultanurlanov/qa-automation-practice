package THREADQA.AutoTest.Bug;


public class BugReport {

    static void main(String[] args) {


       Bug bug = new Bug(1,"Падает вход в приложение","BLOCKER");
        System.out.println(bug.getSeverity());
    }

}

