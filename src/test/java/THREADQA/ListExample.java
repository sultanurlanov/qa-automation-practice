package THREADQA;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Person> names = getPersonNames();
        List<Person> namesMinelials = new ArrayList<>();

        for (Person person : names) {
            if (person.getAge() > 23) {
                namesMinelials.add(person);
            }
        }
        System.out.println(names);
        System.out.println(namesMinelials);

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
