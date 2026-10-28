package THREADQA.Dog;

import java.util.Random;

public class Shakal extends Dog{

    @Override
    void search() {
        System.out.println("Шакал ищет днем");
    }

    public void randomAction(){
        int randomNumber = random.nextInt(3);
        switch (randomNumber){
            case 0:
                search();
                break;
            case 1:
                hunt();
                break;
            case 2:
                gavGav();
                break;
        }
    }

    public void hunt() {
        System.out.println("шакал охотится");
    }

    public void gavGav() {
        System.out.println("шакал гавкает");
    }
}
