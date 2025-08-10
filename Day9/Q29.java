package Assignment9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q29 {
    public static void main(String[] args) throws IOException {
    	Path path = Paths.get("story.txt");
		
		Files.createFile(path);
		System.out.println("File created");
		
		try
		{
			BufferedWriter b = new BufferedWriter(new FileWriter("story.txt"));
			
			b.write("Java is very eay to learn language");
			b.newLine();
			b.write("Java is OOP language");
			b.newLine();
			b.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("story.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line.replace("Java", "Python")).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e);
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("updated_story.txt"))) {
            bw.write(sb.toString());
            System.out.println("Java replaced by Python and updated_story.txt successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
