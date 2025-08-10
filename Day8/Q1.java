package Assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("ArrayList: " + numbers);

        System.out.print("Enter a number to search: ");
        int searchNum = sc.nextInt();

        if (numbers.contains(searchNum)) {
            System.out.println(searchNum + " is found in the list.");
        } else {
            System.out.println(searchNum + " is NOT found in the list.");
        }

        sc.close();

	}

}
