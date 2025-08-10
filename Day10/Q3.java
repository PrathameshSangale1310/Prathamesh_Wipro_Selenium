package Assignment10;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Q3 {

	public static void main(String[] args) {
		try
		{
			BufferedWriter f = new BufferedWriter(new FileWriter("test.txt"));
			f.write("Hello");
			f.newLine();
			f.write("World!");
			f.close();
			System.out.println("Write file successfully.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
