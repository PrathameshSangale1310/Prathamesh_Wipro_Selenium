package Assignment8;

import java.util.LinkedList;

public class Q13 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Before Insertion:");
        for (String name : names) {
            System.out.println(name);
        }

        names.add(2, "Emma");

        System.out.println("\nAfter Insertion at index 2:");
        for (String name : names) {
            System.out.println(name);
        }

	}

}
