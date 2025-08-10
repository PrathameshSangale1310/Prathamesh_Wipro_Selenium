package Assignment8;

import java.util.Scanner;
import java.util.Stack;

public class Q28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        int number = decimal;

        if (number == 0) {
            System.out.println("Binary: 0");
            return;
        }

        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        System.out.print("Binary: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
        sc.close();

	}

}
