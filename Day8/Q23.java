package Assignment8;

import java.util.Vector;

public class Q23 {

	public static void main(String[] args) {
		Vector<Integer> vector1 = new Vector<>();
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        vector1.add(40);

        Vector<Integer> vector2 = new Vector<>();
        vector2.addAll(vector1);

        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);

        if (vector1.equals(vector2)) {
            System.out.println("Both vectors are equal.");
        } else {
            System.out.println("Vectors are not equal.");
        }

	}

}
