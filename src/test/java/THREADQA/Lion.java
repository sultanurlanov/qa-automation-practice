package THREADQA;

public class Lion extends CatFamily{

    public void laudSay() {
        System.out.println("лев рычит");
    }

    @Override
    public void sleep() {
        System.out.println("лев спит больше");;
    }
}
