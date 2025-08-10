package Assignment10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q17 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("q17.txt");
		
		Files.createFile(path);
		System.out.println("File Created");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("q17copied.txt"));
		bw.write("Hello");
		bw.newLine();
		bw.write("World");	
		bw.close();
		
		Path copypath = Paths.get("copiedfile.txt");
		Files.copy(path, copypath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Copied.");

	}

}
