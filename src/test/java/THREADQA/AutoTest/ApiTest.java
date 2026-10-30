package THREADQA.AutoTest;

import java.util.Random;

public class ApiTest extends AutoTests{

    @Override
    void run() {
        System.out.println("API -тест запущен");
    }

    @Override
    void randomResult() {
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                passed();
                break;
            case 1:
                failed();
                break;
            case 2:
                skipped();
                break;
        }
    }


    public void passed() {
        System.out.println("API test: Passed");
    }

    public void failed() {
        System.out.println("API test: Failed");
    }

    public void skipped() {
        System.out.println("API test: Skiped");
    }
}
