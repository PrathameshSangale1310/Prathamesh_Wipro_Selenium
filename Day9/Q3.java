package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    public String toString() {
        return id + " - " + name + " - ₹" + salary;
    }
}


public class Q3 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Prathamesh", 70000));
        list.add(new Employee(2, "Krishna", 55000));
        list.add(new Employee(3, "Omkar", 60000));
        list.add(new Employee(4, "Deep", 65000));

        Collections.sort(list);

        for (Employee e : list) {
            System.out.println(e);
        }

	}

}
