package Assignment8;

import java.util.LinkedList;

public class Q14 {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();


		animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");

        System.out.println("Original List:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        animals.removeFirst();

        animals.removeLast();

        animals.remove("Elephant");

        System.out.println("\nUpdated List:");
        for (String animal : animals) {
            System.out.println(animal);
        }

	}

}
