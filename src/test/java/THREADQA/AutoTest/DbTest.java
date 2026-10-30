package THREADQA.AutoTest;

public class DbTest extends AutoTests{
    @Override
    void run() {
        System.out.println("DB-test запушен");
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
                skiped();
                break;
        }

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
