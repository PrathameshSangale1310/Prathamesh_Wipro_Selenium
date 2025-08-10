package Assignment8;

import java.util.Vector;

public class Q24 {
	public static int sumVector(Vector<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(10);
        vector.add(15);
        vector.add(20);

        int result = sumVector(vector);
        System.out.println("Sum of vector elements: " + result);
    }
}
