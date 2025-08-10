package Assignment8;

import java.util.LinkedList;
import java.util.Queue;

public class Q38 {

	public static void main(String[] args) {
		Queue<String> bankQueue = new LinkedList<>();

        bankQueue.add("Prathamesh");
        bankQueue.add("Om");
        bankQueue.add("Ram");
        bankQueue.add("Shyam");
        bankQueue.add("Sagar");

        System.out.println("Initial queue: " + bankQueue);

        while (!bankQueue.isEmpty()) {
            String servedCustomer = bankQueue.poll();
            System.out.println("Serving: " + servedCustomer);
            System.out.println("Queue after serving: " + bankQueue);
            System.out.println();
        }

	}

}
