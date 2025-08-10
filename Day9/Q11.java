package Assignment9;

import java.util.*;

class Student2 implements Comparable<Student2> {
    int rollNo;
    String name;
    int marks;

    Student2(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student2 other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return rollNo + " - " + name + " - Marks: " + marks;
    }
}

public class Q11 {
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2(1, "Prathamesh", 45));
        list.add(new Student2(2, "Sagar", 87));
        list.add(new Student2(3, "Om", 64));
        list.add(new Student2(4, "Deep", 55));

        System.out.println("Original List:");
        list.forEach(System.out::println);

        Collections.sort(list);
        System.out.println("\nSorted by Name (Alphabetical):");
        list.forEach(System.out::println);

        Collections.sort(list, new Comparator<Student2>() {
            public int compare(Student2 s1, Student2 s2) {
                return Integer.compare(s2.marks, s1.marks);
            }
        });
        System.out.println("\nSorted by Marks (Descending):");
        list.forEach(System.out::println);
    }
}
