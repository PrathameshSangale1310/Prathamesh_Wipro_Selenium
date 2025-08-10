package Assignment9;

import java.io.FileWriter;
import java.io.IOException;

public class Q16 {

	public static void main(String[] args) {
		try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Prathamesh\n");
            writer.write("Sagar\n");
            writer.write("Deep\n");
            writer.write("Om\n");
            writer.write("Krishna");

            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

	}

}
