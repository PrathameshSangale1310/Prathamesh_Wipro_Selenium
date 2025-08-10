package Assignment8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q40 {
	public static List<Integer> getEvenNumbers(Queue<Integer> queue) {
        List<Integer> evens = new ArrayList<>();
        for (int num : queue) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(7);
        numbers.add(4);
        numbers.add(9);
        numbers.add(2);

        List<Integer> evenNumbers = getEvenNumbers(numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }
}
