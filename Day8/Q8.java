package Assignment8;

import java.util.ArrayList;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Q8 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Alice", 85.5));
        students.add(new Student(2, "Bob", 90.0));
        students.add(new Student(3, "Charlie", 78.2));

        System.out.println("Student Details:");
        for (Student s : students) {
            s.display();
        }

	}

}
