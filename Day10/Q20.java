package Assignment10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Employee [Name=" + name + ", ID=" + id + ", Salary=" + salary + "]";
    }
}

public class Q20 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	FileOutputStream fos = new FileOutputStream("employee.docx");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Employee e1 = new Employee("Prathamesh", 101, 50000);
        Employee e2 = new Employee("Sagar", 102, 60000);

        oos.writeObject(e1);
        oos.writeObject(e2);

        oos.close();
        fos.close();

        System.out.println("Serialization complete.\n");

        FileInputStream fis = new FileInputStream("employee.docx");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee emp1 = (Employee) ois.readObject();
        Employee emp2 = (Employee) ois.readObject();

        System.out.println("Deserialized Objects:");
        System.out.println(emp1);
        System.out.println(emp2);

        ois.close();
        fis.close();
    }
}

