package Assignment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Q15 {

	public static void main(String[] args) {
		Path path = Paths.get("example.txt");
		try {
            String line = "This is the first line.\n";
            Files.write(path, line.getBytes());

            String appendeddata = "This is appended text.\n";
            Files.write(path, appendeddata.getBytes(), StandardOpenOption.APPEND);

            System.out.println("Data written and appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
