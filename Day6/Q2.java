package Assignment6;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
        int num = sc.nextInt();
        String str = String.valueOf(num);
        System.out.println("Converted to String: " + str);

        try {
            int x = Integer.parseInt(str);
            System.out.println("Converted back to int: " + x);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }

        sc.close();

	}

}
