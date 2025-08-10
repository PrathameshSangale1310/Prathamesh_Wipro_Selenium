package Assignment3;

import java.util.Scanner;

public class Arrayq5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] arr = {5, 10, 15, 20, 25, 30};

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        boolean found = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + target + " found at index " + index + ".");
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }

        sc.close();

	}

}
