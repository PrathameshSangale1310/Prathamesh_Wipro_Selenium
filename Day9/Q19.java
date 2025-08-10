package Assignment9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q19 {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
