package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
    int rollNo;
    String name;

    Students(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int compareTo(Students other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    public String toString() {
        return rollNo + " - " + name;
    }
}

public class Q5 {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(23, "Prathamesh"));
        list.add(new Students(12, "Krishna"));
        list.add(new Students(45, "Deep"));
        list.add(new Students(5, "Sagar"));

        System.out.println("Before sorting:");
        for (Students s : list) {
            System.out.println(s);
        }

        Collections.sort(list);

        System.out.println("\nAfter sorting:");
        for (Students s : list) {
            System.out.println(s);
        }
    }
}
