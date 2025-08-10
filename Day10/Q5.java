package Assignment10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Q5 {

	public static void main(String[] args) throws IOException {		
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt",true));
			bw.write("\nAppended data");
			bw.newLine();
			bw.write("Welcome to Wipro program");
			bw.close();
			System.out.println("Write file successfully.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
