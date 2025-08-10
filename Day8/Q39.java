package Assignment8;

import java.util.LinkedList;
import java.util.Queue;

public class Q39 {

	public static void main(String[] args) {
		Queue<String> taskQueue = new LinkedList<>();

        taskQueue.add("Backup database");
        taskQueue.add("Send email reports");
        taskQueue.add("Clean temporary files");
        taskQueue.add("Update antivirus");
        taskQueue.add("Optimize performance");

        System.out.println("All Tasks: " + taskQueue);
        System.out.println();

        System.out.println("Next task to be done: " + taskQueue.peek());
        System.out.println();

        while (!taskQueue.isEmpty()) {
            String completedTask = taskQueue.poll();
            System.out.println("Completed: " + completedTask);
            System.out.println("Remaining tasks: " + taskQueue);
            System.out.println();
        }

	}

}
