package Assignment9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);

    	 try {
             System.out.println("Enter text for line 1:");
             String line1 = scanner.nextLine();

             System.out.println("Enter text for line 2:");
             String line2 = scanner.nextLine();

             System.out.println("Enter text for line 3:");
             String line3 = scanner.nextLine();

             FileWriter writer = new FileWriter("userinput.txt");
             writer.write(line1 + "\n");
             writer.write(line2 + "\n");
             writer.write(line3 + "\n");
             writer.close();

             System.out.println("File updated successfully with 3 lines.");
         } catch (IOException e) {
             System.out.println("An error occurred: " + e.getMessage());
         } finally {
             scanner.close();
         }
    }
}
