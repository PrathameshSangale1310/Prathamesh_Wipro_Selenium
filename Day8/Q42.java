package Assignment8;

import java.util.PriorityQueue;

class PrintJob {
    String jobName;
    int priority;

    public PrintJob(String jobName, int priority) {
        this.jobName = jobName;
        this.priority = priority;
    }

    public String toString() {
        return jobName + " (Priority: " + priority + ")";
    }
}

public class Q42 {

		public static void main(String[] args) {
	        PriorityQueue<PrintJob> printQueue = new PriorityQueue<>(
	            (j1, j2) -> Integer.compare(j2.priority, j1.priority)
	        );

	        printQueue.add(new PrintJob("Doc A", 2));
	        printQueue.add(new PrintJob("Doc B", 5));
	        printQueue.add(new PrintJob("Doc C", 3));
	        printQueue.add(new PrintJob("Doc D", 1));

	        while (!printQueue.isEmpty()) {
	            System.out.println("Printing: " + printQueue.poll());
	        }

	}

}
