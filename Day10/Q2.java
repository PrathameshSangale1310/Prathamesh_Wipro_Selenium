package Assignment10;

import java.io.File;

public class Q2 {

	public static void main(String[] args) {
		File f = new File("test.txt");
		if(f.exists())
		{
			System.out.println("File location:" +f.getAbsolutePath());
			System.out.println("File test.txt found");
		}
		else
		{
			System.out.println("File not found");
		}

	}

}
