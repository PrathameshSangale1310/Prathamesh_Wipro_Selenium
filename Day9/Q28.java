package Assignment9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();
        sc.close();

        boolean found = false;

        try {
            File file = new File("student.txt");
            Scanner sc1 = new Scanner(file);

            while (sc1.hasNextLine()) {
                String line = sc1.nextLine();
                if (line.contains(word)) {
                    found = true;
                    break;
                }
            }

            sc1.close();

            if (found) {
                System.out.println("Word found in notes.txt.");
            } else {
                System.out.println("Word not found in notes.txt.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("notes.txt file not found.");
        }
    }
}