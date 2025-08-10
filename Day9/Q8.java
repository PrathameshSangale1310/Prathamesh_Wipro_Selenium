package Assignment9;

import java.time.LocalDate;
import java.util.*;

class Employee1 {
    int id;
    String name;
    LocalDate joiningDate;

    Employee1(int id, String name, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
    }

    public String toString() {
        return id + " - " + name + " - Joined: " + joiningDate;
    }
}

class JoiningDateComparator implements Comparator<Employee1> {
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.joiningDate.compareTo(e2.joiningDate);
    }
}

public class Q8 {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();

        employees.add(new Employee1(101, "Prathamesh", LocalDate.of(2025, 5, 10)));
        employees.add(new Employee1(102, "Krishna", LocalDate.of(2016, 4, 5)));
        employees.add(new Employee1(103, "Sagar", LocalDate.of(2024, 10, 7)));

        System.out.println("Before sorting:");
        employees.forEach(System.out::println);

        Collections.sort(employees, new JoiningDateComparator());

        System.out.println("\nSorted by Joining Date (Ascending):");
        employees.forEach(System.out::println);
    }
}
