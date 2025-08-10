package Assignment9;

import java.io.*;
import java.util.*;

public class Q23 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("userinput.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading data.txt: " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("reversed.txt"))) {
            for (int i = lines.size() - 1; i >= 0; i--) {
                writer.write(lines.get(i));
                writer.newLine();
            }
            System.out.println("Reversed content written to reversed.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to reversed.txt: " + e.getMessage());
        }
    }
}
