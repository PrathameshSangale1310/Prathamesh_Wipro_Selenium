package Assignment9;

import java.io.File;

public class Q21 {

	public static void main(String[] args) {
		File f = new File("student.txt");
		if(f.exists())
		{
			System.out.println("File name: "+f.getName());
			System.out.println("File location:" +f.getAbsolutePath());
			System.out.println("File size: "+f.length());
			System.out.println("File readable: "+f.canRead());
			System.out.println("File Writable: "+f.canWrite());
		}
		else
		{
			System.out.println("File not found");
		}

	}

}
