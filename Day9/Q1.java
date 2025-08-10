package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int rollno,marks;
    String name;

    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks=marks;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.rollno, other.rollno);
    }

    public String toString() {
        return rollno + " - " + name+ " - " + marks;
    }
}

public class Q1 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
        list.add(new Student(12, "Prathamesh",75));
        list.add(new Student(5, "Ram",80));
        list.add(new Student(9, "Shyam",65));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s);
        }

	}

}
