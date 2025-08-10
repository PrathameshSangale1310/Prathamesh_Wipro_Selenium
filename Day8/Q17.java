package Assignment8;

import java.util.Collections;
import java.util.LinkedList;

public class Q17 {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(42);
        numbers.add(17);
        numbers.add(93);
        numbers.add(8);
        numbers.add(56);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted List: " + numbers);

	}

}
