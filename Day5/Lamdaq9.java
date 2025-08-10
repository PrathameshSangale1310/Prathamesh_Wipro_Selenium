package Assignment5;

interface Factorial {
    int compute(int n);
}

public class Lamdaq9 {

	public static void main(String[] args) {
		Factorial fact = (n) -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int number = 6;
        System.out.println("Factorial of " + number + " is: " + fact.compute(number));

	}

}
