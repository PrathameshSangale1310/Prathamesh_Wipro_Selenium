package Assignment9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student3 implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private double marks;

    public Student3(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Student3 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}

public class Q24 {
    public static void main(String[] args) {
        Student3 student = new Student3(101, "Prathamesh", 74.5);

        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

            oos.close();
            fos.close();

            System.out.println("Student3 object serialized and saved as student.ser");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }
}