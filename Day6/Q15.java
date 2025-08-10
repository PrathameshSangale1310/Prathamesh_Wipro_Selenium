package Assignment6;

public class Q15 {

	public static void main(String[] args) {
		try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Division operation completed.");
        }

        System.out.println();
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } finally {
            System.out.println("Array access operation completed.");
        }

	}

}
