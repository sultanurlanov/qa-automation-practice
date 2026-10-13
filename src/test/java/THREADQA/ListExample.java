package THREADQA;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
//        List<Person> names = getPersonNames();
//        List<Person> namesMinelials = new ArrayList<>();
//        List<Person> namesDelete = new ArrayList<>();
//
//        for (Person person : names) {
//            if (person.getAge() > 23) {
//                namesMinelials.add(person);
//            }
//        }
//
//        names.removeIf(person -> person.getName() == "Max");
//
//        System.out.println(names);
//        System.out.println(namesMinelials);
//
//    }

//        Set<String> names = new HashSet<>();
//        List<String> nameOriginal = new ArrayList<>() {{
//        names.add("Lexus");
//        names.add("BYD");
//        names.add("Nissan");
//        names.add("Tayota");
//        names.add("Nissan");
//        }};
//
//        for (String name : names) {
//            if (name.equals("Nissan")){
//                System.out.println("машина найдена");
//                break;
//            }
//
//        }
//
//        Set<String> name = new HashSet<>(nameOriginal);
//        System.out.println(name);
//
//        System.out.println(names);

        Map<String, Integer> peoples = new HashMap<>();
        peoples.put("Max",23);
        peoples.put("Alina",18);
        peoples.put("Atai",33);
        peoples.put("Milana",34);

        for (Map.Entry<String, Integer> stringIntegerEntry : peoples.entrySet()) {
           if (stringIntegerEntry.getKey().equals("Milana")){
               System.out.println("элемент найден");
           }

        }

        System.out.println(peoples.get("Milana"));
        peoples.replace("Alina",21);
        System.out.println(peoples);

    }


    public static List<Person> getPersonNames() {
        List<Person> person = new ArrayList<Person>() {{
            add(new Person("Max",22));
            add(new Person("Adi",34));
            add(new Person("Sultan",32));
            add(new Person("Bema",28));
            add(new Person("Rus",18));

        }};
        return person;
    }
}
