package Assignment10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
	try {
		File file = new File("test.txt");

        Scanner sc = new Scanner(file);

        System.out.println("Tokens in the file:");

        while (sc.hasNext()) {
            String token = sc.next();
            System.out.println(token);
        }

    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
    }

	}

}
