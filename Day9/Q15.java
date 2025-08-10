package Assignment9;

import java.util.*;

class Person3 {
    private String name;
    private int age;

    Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class Q15 {
    public static void main(String[] args) {
        Comparator<Person3> ageComparator = Comparator.comparingInt(Person3::getAge);

        Set<Person3> personSet = new TreeSet<>(ageComparator);

        personSet.add(new Person3("Prathamesh", 25));
        personSet.add(new Person3("Sagar", 30));
        personSet.add(new Person3("Deep", 22));
        personSet.add(new Person3("Om", 28));

        System.out.println("Sorted by Age (TreeSet):");
        for (Person3 p : personSet) {
            System.out.println(p);
        }
    }
}
