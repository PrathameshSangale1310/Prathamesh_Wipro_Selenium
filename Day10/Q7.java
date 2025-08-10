package Assignment10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q7 {

	public static void main(String[] args) throws IOException {
Path path = Paths.get("sample4.txt");
		
		Files.createFile(path);
		System.out.println("File Created");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("sample4.txt"));
		bw.write("Hello");
		bw.newLine();
		bw.write("World");	
		bw.close();
		
		Path copypath = Paths.get("copiedfile4.txt");
		Files.copy(path, copypath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Copied.");
		

	}

}
