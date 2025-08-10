package Assignment8;

import java.util.LinkedHashSet;

public class Q32 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5);

        System.out.println("LinkedHashSet elements:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

	}

}
