package THREADQA.AutoTest;

public class DbTest extends AutoTests{
    @Override
    void run() {
        System.out.println("DB-test запушен");
    }

    @Override
    void randomResult() {

    }

    public void passed() {
        System.out.println("DB test: Passed");
    }

    public void failed() {
        System.out.println("DB test: Failed");
    }

    public void skiped() {
        System.out.println("DB test: Skiped");
    }
}
