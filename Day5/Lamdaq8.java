package Assignment5;

import java.util.function.Function;

public class Lamdaq8 {

	public static void main(String[] args) {
		double[] numbers = {3.5, 7.2, 1.8, 4.0, 9.1};

        Function<double[], Double> max = arr -> {
            double m = arr[0];
            for (double n : arr) if (n > m) m = n;
            return m;
        };

        Function<double[], Double> min = arr -> {
            double m = arr[0];
            for (double n : arr) if (n < m) m = n;
            return m;
        };

        System.out.println("Max: " + max.apply(numbers));
        System.out.println("Min: " + min.apply(numbers));

	}

}
