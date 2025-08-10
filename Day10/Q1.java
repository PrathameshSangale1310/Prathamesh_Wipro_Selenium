package Assignment10;

import java.io.File;

public class Q1 {

	public static void main(String[] args) {
		File f = new File("test.txt");
		try
		{
			f.createNewFile();
			System.out.println("File created sucessfully");
			}
		catch(Exception e)
		{
			System.out.println("File not found");
			System.out.println(e);
		}

	}

}
