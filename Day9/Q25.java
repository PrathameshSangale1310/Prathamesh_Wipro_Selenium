package Assignment9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q25 {

	public static void main(String[] args) {
		try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student3 student = (Student3) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Deserialized Student object:");
            System.out.println(student);

        } catch (IOException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Student3 class not found: " + e.getMessage());
        }

	}

}
