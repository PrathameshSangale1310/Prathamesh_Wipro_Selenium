package Assignment10;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q8 {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\Prathamesh\\Desktop\\Filehandling_practice");
		File f = path.toFile();


        if (f.exists() && f.isDirectory()) {
            String[] fileList = f.list();

            System.out.println("Files in directory: " + path);
            for (String fileName : fileList) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("Invalid directory path!");
        }

	}

}
