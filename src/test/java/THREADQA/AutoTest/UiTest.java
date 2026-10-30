package THREADQA.AutoTest;

public class UiTest extends AutoTests{
    @Override
    void run() {
        System.out.println("UI-test запушен");
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
        System.out.println("UI test: Passed");
    }

    public void failed() {
        System.out.println("UI test: Failed");
    }

    public void skipped() {
        System.out.println("UI test: Skipped");
    }
}
