package Assignment6;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        int truncatedFahrenheit = (int) fahrenheit;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Fahrenheit in int: " + truncatedFahrenheit);

        sc.close();

	}

}
