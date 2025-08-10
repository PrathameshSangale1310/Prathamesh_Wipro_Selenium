package Assignment5;

public class Encapsulationq1 {
	 private String name;
	    private int rollNumber;
	    private int marks;

	    public Encapsulationq1(String name, int rollNumber, int marks) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.marks = (marks >= 0 && marks <= 100) ? marks : 0;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public int getMarks() {
	        return marks;
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	    }

	    public void inputMarks(int newMarks) {
	        if (newMarks >= 0 && newMarks <= 100 && newMarks > this.marks) {
	            this.marks = newMarks;
	        }
	    }

	public static void main(String[] args) {
		Encapsulationq1 s1 = new Encapsulationq1("Prathamesh", 51, 65);
        s1.displayDetails();

        Encapsulationq1 s2 = new Encapsulationq1("Omkar", 55, 110);
        s2.displayDetails();

        s1.inputMarks(90);
        s1.displayDetails();

        s1.inputMarks(70);
        s1.displayDetails();

	}

}
