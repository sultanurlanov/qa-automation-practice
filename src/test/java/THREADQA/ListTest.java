package THREADQA;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ListTest {

    static void main() {
//        List<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(2);
//        nums.add(6);
//        nums.add(4);

//        Map<String, Integer> names = new HashMap<>();
//        names.put("Max",24);
//        names.put("Venera",28);
//        names.put("Dana",34);
//        names.put("Fara",30);
//        names.put("Gera",18);
//
//        names.replace("Venera",22);
//        for (Map.Entry<String, Integer> stringIntegerEntry : names.entrySet()) {
//           if (stringIntegerEntry.getValue().equals(30)) {
//               System.out.println("нашли Fara");
//               break;
//           }
//        }
//
//        System.out.println(names);

        List<CarWithEnum> cars = new ArrayList<>(){{
            add(new CarWithEnum("Lexus", TypeCar.CROSSOVER, "white",4));
            add(new CarWithEnum("Tayota", TypeCar.SEDAN, "silver",4));
            add(new CarWithEnum("Zikr", TypeCar.HATCHBACK, "black",4));
            add(new CarWithEnum("Honda", TypeCar.CROSSOVER, "black",2));
        }};

       Optional<CarWithEnum> firstCar = cars.stream()
               .filter(temp -> temp.getColor().equals("black"))
               .findFirst();
               firstCar.ifPresent(carWithEnum -> System.out.println(carWithEnum.getName()));



        CarWithEnum lastCar = cars.get(cars.size() - 1);
        System.out.println(lastCar);

        CarWithEnum lastCarStream = cars.stream().reduce((temp, next) -> next).get();
        System.out.println(lastCarStream);

        cars.stream().filter(x -> x.getName().equals("Audi"))
                .findFirst().orElseThrow(() -> new IllegalStateException("not found"));

        List<CarWithEnum> carWithEnums  = cars.stream()
                .filter(temp -> temp.getType()
                        .equals(TypeCar.CROSSOVER))
                .collect(Collectors.toList());
        System.out.println(carWithEnums);

        List<CarWithEnum> carBlackColor = cars.stream()
                .filter(temp -> temp.getColor()
                        .equals("black"))
                .collect(Collectors.toList());
        System.out.println(carBlackColor);

        List<CarWithEnum> carCrossover = cars.stream()
                .filter(temp -> temp.getType().equals(TypeCar.CROSSOVER) && temp.getColor().equals("black"))
                .collect(Collectors.toList());;
        System.out.println(carCrossover);

        List<String> names = cars.stream()
                .filter(temp -> temp.getDoor() == 4)
                .map(CarWithEnum::getName)
                .toList();
        System.out.println(names);

        List<String> carsUperCase = cars.stream()
                .filter(temp -> temp.getType().equals(TypeCar.CROSSOVER))
                .map(temp -> temp.getName().toUpperCase())
                        .collect(Collectors.toList());
        System.out.println(carsUperCase);

        List<CarWithEnum> crossover = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            CarWithEnum temp = cars.get(i);
            if (temp.getType().equals(TypeCar.CROSSOVER)){
                crossover.add(temp);
            }
        }
        System.out.println(crossover);

    }




    public static boolean firstLast6(List<Integer> nums) {

        return nums.get(0) == 6 || nums.get(nums.size() - 1) == 6;

//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(0) == 6 || nums.get(nums.size() - 1) == 6) {
//                return true;
//            }
//        }
//        return false;
    }
    }

