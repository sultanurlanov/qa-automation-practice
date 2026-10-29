package THREADQA.Dog;

import java.util.*;

public class DogTask {

    private static Random random = new Random();



    static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            dogs.add(getRandomDog());
        }

        int startCount = dogs.size();
        int countDoc = startCount;

        for (int i = 1; i < 365; i++ ){
            int randomIndex = random.nextInt(dogs.size());
            Dog tempDog = dogs.get(randomIndex);
            tempDog.randomAction();


            if (i % 30 == 11){
                dogs.add(getRandomDog());
                System.out.println("!!!!!! Новая собака !!!!!!!!");
            }
        }

        System.out.println("Было собак: " + countDoc);
        System.out.println("Стало собак: " + dogs.size());

        Map<String, Integer> animals = new HashMap<>();
        for (Dog dog : dogs){
            String className = dog.getClass().getSimpleName();
            animals.put(className, animals.getOrDefault(className,0)+1);

//            if (animals.containsKey(className)){
//                int conutName = animals.get(className);
//                animals.put(className,conutName +1);
//            } else {
//                animals.put(className,1);
//            }
        }

        for (String className : animals.keySet()){
            int count = animals.get(className);
            System.out.println(className + ": " + count);
        }

    }

    // генерация 30 случайных собак
    public static Dog getRandomDog(){
        Dog tempDog = null;
        int randomNumber = random.nextInt(3);
        tempDog = switch (randomNumber) {
            case 0 -> new Kayot();
            case 1 -> new Shakal();
            case 2 -> new Wolf();
            default -> tempDog;
        };
        return tempDog;
    }
}
