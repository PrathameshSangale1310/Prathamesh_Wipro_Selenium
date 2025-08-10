package Assignment8;

import java.util.ArrayList;
import java.util.Collections;

public class Q3 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(42);
        numbers.add(13);
        numbers.add(89);
        numbers.add(5);
        numbers.add(66);
        numbers.add(27);
        numbers.add(34);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted List (Ascending Order): " + numbers);
	}

}
