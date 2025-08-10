package Assignment6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q18 {

	public static void main(String[] args) {
		String filename = "sample.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            String line = reader.readLine();

            int number = Integer.parseInt(line);

            int result = 100 / number;
            System.out.println("Result: " + result);

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } finally {
            System.out.println("Execution completed");
        }

	}

}
