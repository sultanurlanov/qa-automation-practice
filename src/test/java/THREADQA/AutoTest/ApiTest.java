package THREADQA.AutoTest;

public class ApiTest extends AutoTests{

    @Override
    void run() {
        System.out.println("API -тест запущен");
    }

    @Override
    void randomResult() {
    }

    public void passed() {
        System.out.println("API test: Passed");
    }

    public void failed() {
        System.out.println("API test: Failed");
    }

    public void skiped() {
        System.out.println("API test: Skiped");
    }
}
