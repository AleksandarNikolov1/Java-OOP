package L04_Interfaces_and_Abstraction.Lab.P03_Say_Hello;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));

        for (Person person : persons) {
            print(person);
        }

    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }
}
