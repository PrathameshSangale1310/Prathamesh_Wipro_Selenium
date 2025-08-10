package Assignment8;

import java.util.PriorityQueue;

class Patient {
    String name;
    int severityLevel;

    public Patient(String name, int severityLevel) {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    public String toString() {
        return name + " (Severity: " + severityLevel + ")";
    }
}


public class Q41 {

	public static void main(String[] args) {
		PriorityQueue<Patient> queue = new PriorityQueue<>(
	            (p1, p2) -> Integer.compare(p2.severityLevel, p1.severityLevel)
	        );

	        queue.add(new Patient("Prathamesh", 3));
	        queue.add(new Patient("Om", 5));
	        queue.add(new Patient("Ram", 2));
	        queue.add(new Patient("Shyam", 4));
	        queue.add(new Patient("Sagar", 1));

	        while (!queue.isEmpty()) {
	            System.out.println("Serving: " + queue.poll());
	        }

	}

}
