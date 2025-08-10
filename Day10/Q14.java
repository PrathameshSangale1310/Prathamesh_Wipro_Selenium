package Assignment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Q14 {

	public static void main(String[] args) {
		 Path path = Paths.get("test.txt");

	        try {
	            List<String> lines = Files.readAllLines(path);

	            for (String line : lines) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file: " + e.getMessage());
	        }
	}

}
