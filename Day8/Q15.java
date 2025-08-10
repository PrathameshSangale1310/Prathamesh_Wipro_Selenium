package Assignment8;

import java.util.LinkedList;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Cherry");
        names.add("Mango");
        names.add("Orange");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fruit name to search: ");
        String searchItem = scanner.nextLine();

        if (names.contains(searchItem)) {
            System.out.println(searchItem + " is found in the list.");
        } else {
            System.out.println(searchItem + " is not found in the list.");
        }

        scanner.close();

	}

}
