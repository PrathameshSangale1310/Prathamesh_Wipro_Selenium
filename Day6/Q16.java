package Assignment6;


class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}


public class Q16 {
	public static void checkOdd(int n) throws OddNumberException {
        if (n % 2 != 0) {
            throw new OddNumberException("Odd number: " + n);
        } else {
            System.out.println(n + " is even.");
        }
    }

	public static void main(String[] args) {
		int[] testValues = {2, 5, 8, 11, 14};

        for (int n : testValues) {
            try {
                checkOdd(n);
            } catch (OddNumberException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

	}

}
