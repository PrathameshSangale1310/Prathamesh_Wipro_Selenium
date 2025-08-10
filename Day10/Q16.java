package Assignment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Q16 {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\Prathamesh\\Desktop\\Filehandling_practice");

        try (Stream<Path> paths = Files.walk(path)) {
            paths.filter(Files::isRegularFile).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
