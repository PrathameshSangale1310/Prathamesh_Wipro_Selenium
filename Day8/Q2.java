package Assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Original Fruit List: " + fruits);

        System.out.print("Enter the name of the fruit to remove: ");
        String fruitToRemove = sc.nextLine();

        if (fruits.remove(fruitToRemove)) {
            System.out.println(fruitToRemove + " has been removed.");
        } else {
            System.out.println(fruitToRemove + " not found in the list.");
        }

        System.out.println("Updated Fruit List: " + fruits);

        sc.close();

	}

}
