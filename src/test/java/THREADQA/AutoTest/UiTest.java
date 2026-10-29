package THREADQA.AutoTest;

public class UiTest extends AutoTests{
    @Override
    void run() {
        System.out.println("UI-test запушен");
    }

    @Override
    void randomResult() {

    }

    public void passed() {
        System.out.println("UI test: Passed");
    }

    public void failed() {
        System.out.println("UI test: Failed");
    }

    public void skiped() {
        System.out.println("UI test: Skiped");
    }
}
