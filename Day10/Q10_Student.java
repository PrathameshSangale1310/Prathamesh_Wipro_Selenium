package Assignment10;

import java.io.Serializable;

public class Q10_Student implements Serializable{

		int id;
		String name;
		
		Q10_Student(int id, String name)
		{
			this.id=id;
			this.name=name;
		}
		
		public String toString()
		{	System.out.println("Id"+" "+"Name");
		return id+" "+name;
		}

}
