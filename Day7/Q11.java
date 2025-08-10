package Assignment7;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}


public class Q11 {
	public static void updateMarks(Student s, int newMarks) {
        s.marks = newMarks;
    }
	
	public static void main(String[] args) {
		Student student = new Student("John", 75);
        System.out.println("Before update: " + student.name + " - " + student.marks);
        updateMarks(student, 90);
        System.out.println("After update: " + student.name + " - " + student.marks);
		

	}

}
