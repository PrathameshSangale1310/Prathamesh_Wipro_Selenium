package Assignment8;

import java.util.TreeSet;

public class Q36 {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(25);

        System.out.println("TreeSet Elements: " + numbers);

        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        int key = 25;

        System.out.println("Element lower than " + key + ": " + numbers.lower(key));
        System.out.println("Element higher than " + key + ": " + numbers.higher(key));

	}

}
