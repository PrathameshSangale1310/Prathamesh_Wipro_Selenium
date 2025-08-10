package Assignment8;

import java.util.LinkedHashSet;
import java.util.Objects;

class Students {
    int id;
    String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;
        Students student = (Students) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return "Students{id=" + id + ", name='" + name + "'}";
    }
}
public class Q33 {

	public static void main(String[] args) {
		LinkedHashSet<Students> students = new LinkedHashSet<>();

        students.add(new Students(1, "Alice"));
        students.add(new Students(2, "Bob"));
        students.add(new Students(3, "Charlie"));

        boolean added = students.add(new Students(1, "Alice"));

        System.out.println("Students in LinkedHashSet:");
        for (Students s : students) {
            System.out.println(s);
        }

        System.out.println("\nWas duplicate student added? " + added);
	}

}
