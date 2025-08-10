package Assignment10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		String path = "sample4.txt";
        String searchWord = "Hello";
        int count = 0;

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.equalsIgnoreCase(searchWord)) {
                    count++;
                }
            }

            scanner.close();
            System.out.println("Word " + searchWord + " count: "+ count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        }

	}

}
