package Assignment10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q13 {

	public static void main(String[] args) throws IOException {
Path path = Paths.get("sample.txt");
		
		Files.createFile(path);
		System.out.println("File Created");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("sample3.txt"));
		bw.write("Hello");
		bw.newLine();
		bw.write("World");	
		bw.close();

		Path movedpath = Paths.get("movedfile.txt");
		Files.move(path, movedpath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Moved.");
		
		Files.deleteIfExists(path);
		Files.deleteIfExists(movedpath);
		System.out.println("Files Deleted.");

	}

}
