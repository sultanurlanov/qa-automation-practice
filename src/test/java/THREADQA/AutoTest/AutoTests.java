package THREADQA.AutoTest;

import java.util.Random;

public abstract class AutoTests {

    abstract void run();

    abstract void randomResult();

    Random random = new Random();
}
