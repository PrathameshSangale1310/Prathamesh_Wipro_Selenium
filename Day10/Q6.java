package Assignment10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q6 {

	public static void main(String[] args) {
		int linecount =0, wordcount=0, charcount=0;
		
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
            	linecount++;
            	charcount += line.length();
                
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordcount += words.length;
                }
            }
            
            System.out.println("Number of lines: " + linecount);
            System.out.println("Number of words: " + wordcount);
            System.out.println("Number of characters: " + charcount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
		

	}

}
