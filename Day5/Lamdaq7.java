package Assignment5;

import java.util.Arrays;

public class Lamdaq7 {

	public static void main(String[] args) {
		double[] numbers = {3.5, 7.2, 1.8, 4.0, 9.1};

        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;

        for (double num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        double average = (numbers.length > 0) ? (sum / numbers.length) : 0;

        System.out.println("Numbers: ");
        for (double n : numbers)
        {
        	System.out.print(n + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);

	}

}
