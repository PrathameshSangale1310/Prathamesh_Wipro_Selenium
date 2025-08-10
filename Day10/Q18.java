package Assignment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q18 {

	public static void main(String[] args) {
		Path path = Paths.get("test.txt");

        try {
            long size = Files.size(path);
            System.out.println("File size: " + size + " bytes");
        } catch (IOException e) {
            System.out.println("Error reading file size: " + e.getMessage());
        }

	}

}
