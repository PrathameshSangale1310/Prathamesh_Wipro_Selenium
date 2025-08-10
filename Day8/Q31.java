package Assignment8;

import java.util.HashSet;

public class Q31 {
	public static int findMax(HashSet<Integer> set) {
        if (set.isEmpty()) {
            throw new IllegalArgumentException("HashSet is empty");
        }

        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(87);
        numbers.add(33);
        numbers.add(59);

        System.out.println("HashSet: " + numbers);

        int maxValue = findMax(numbers);
        System.out.println("Maximum element: " + maxValue);
    }
}

