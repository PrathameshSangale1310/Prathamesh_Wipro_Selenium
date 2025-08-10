package Assignment9;

import java.util.*;

class Employee2 {
    int id;
    String name;
    double salary;
    String department;

    Employee2(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String toString() {
        return id + " - " + name + " - " + salary + " - " + department;
    }
}

public class Q13 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2(101, "Prathamesh", 25000, "HR"));
        list.add(new Employee2(102, "Sagar", 60000, "IT"));
        list.add(new Employee2(103, "Om", 40000, "Finance"));
        list.add(new Employee2(104, "Deep", 30000, "IT"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Sort Menu ---");
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Salary");
            System.out.println("3. Sort by Department");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Collections.sort(list, Comparator.comparing(e -> e.name));
                    System.out.println("\nSorted by Name:");
                    list.forEach(System.out::println);
                    break;
                case 2:
                    Collections.sort(list, Comparator.comparingDouble(e -> e.salary));
                    System.out.println("\nSorted by Salary:");
                    list.forEach(System.out::println);
                    break;
                case 3:
                    Collections.sort(list, Comparator.comparing(e -> e.department));
                    System.out.println("\nSorted by Department:");
                    list.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 4);
    }
}
