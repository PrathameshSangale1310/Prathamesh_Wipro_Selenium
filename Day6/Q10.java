package Assignment6;

enum PriorityLevel {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(4);

    private final int severity;

    PriorityLevel(int severity) {
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    public boolean isUrgent() {
        return severity >= 3;
    }

    public String toString() {
        return name() + " (Severity: " + severity + ", Urgent: " + isUrgent() + ")";
    }
}


public class Q10 {

	public static void main(String[] args) {
		for (PriorityLevel level : PriorityLevel.values()) {
            System.out.println(level);
        }

	}

}
