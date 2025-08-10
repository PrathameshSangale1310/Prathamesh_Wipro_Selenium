package Assignment8;

import java.util.ArrayList;

public class Q6 {

	public static void main(String[] args) {
		 ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        System.out.println("Before clearing: " + numbers);

	        numbers.clear();

	        System.out.println("After clearing: " + numbers);
	        System.out.println("Size of the list: " + numbers.size());

	}

}
