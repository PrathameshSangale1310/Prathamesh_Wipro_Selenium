package Assignment10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q4 {

	public static void main(String[] args) throws IOException {
			List<String> lines = new ArrayList<>();
			BufferedReader f = new BufferedReader(new FileReader("test.txt"));
			String line;
			
			while((line=f.readLine())!=null)
			{
				
				lines.add(line);
			}
			
		
		for(String l: lines)
		{
			System.out.println(l);
		}
		f.close();

	}

}
