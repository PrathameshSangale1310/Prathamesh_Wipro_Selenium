package Assignment9;

import java.io.FileWriter;
import java.io.IOException;

public class Q18 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("Roshan");
            writer.close();
            System.out.println("Student name appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
