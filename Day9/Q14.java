package Assignment9;

import java.util.*;


class Person2 {
    private String name;
    private int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class Q14 {
    public static void main(String[] args) {
        List<Person2> people = new ArrayList<>();
        people.add(new Person2("Prathamesh", 22));
        people.add(new Person2("Sagar", 30));
        people.add(new Person2("Deep", 23));
        people.add(new Person2("Om", 28));

        System.out.println("Original List:");
        people.forEach(System.out::println);

        people.sort(Comparator.comparing(Person2::getName));

        System.out.println("\nSorted by Name:");
        people.forEach(System.out::println);

        people.sort(Comparator.comparingInt(Person2::getAge));

        System.out.println("\nSorted by Age:");
        people.forEach(System.out::println);
    }
}
