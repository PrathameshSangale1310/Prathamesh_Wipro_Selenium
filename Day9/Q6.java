package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
    int rollNo;
    String name;
    int marks;

    Student1(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }
}

class MarksDescendingComparator implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        return Integer.compare(s2.marks, s1.marks);
    }
}

public class Q6 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "Prathamesh", 85));
        list.add(new Student1(2, "Sagar", 92));
        list.add(new Student1(3, "Krishna", 76));
        list.add(new Student1(4, "Deep", 89));

        System.out.println("Before sorting:");
        for (Student1 s : list) {
            System.out.println(s);
        }

        Collections.sort(list, new MarksDescendingComparator());

        System.out.println("\nAfter sorting by marks (descending):");
        for (Student1 s : list) {
            System.out.println(s);
        }
    }
}
