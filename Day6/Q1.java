package Assignment6;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter integer value to convert to double:");
	        int n = sc.nextInt();
	        double d = n;
	        System.out.println("int --> double: " + d);

	        System.out.println("Enter double value to convert to int:");
	        double a = sc.nextDouble();
	        int b = (int) a;
	        System.out.println("double --> int: " + b);
	        
	        short c = (short)b;
	        System.out.println("int --> short: " + c);

		
	}

}
