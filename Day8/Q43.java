package Assignment8;

import java.util.PriorityQueue;

public class Q43 {
	
	public static PriorityQueue<Integer> mergeQueues(PriorityQueue<Integer> q1, PriorityQueue<Integer> q2) {
        PriorityQueue<Integer> merged = new PriorityQueue<>(q1);
        merged.addAll(q2);
        return merged;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(10);
        queue1.add(30);
        queue1.add(20);

        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(25);
        queue2.add(5);
        queue2.add(15);

        PriorityQueue<Integer> result = mergeQueues(queue1, queue2);

        while (!result.isEmpty()) {
            System.out.print(result.poll() + " ");
        }
    }
}