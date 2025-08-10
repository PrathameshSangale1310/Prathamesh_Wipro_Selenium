package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Q2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mynewdb";
		String user="root";
		String password="Prathamesh13";
		
		
		String sql = "create table if not exists student(rollno int,"
				+ " name varchar(50), "
				+ "per int, "
				+ "eamil varchar(50))";
		
		String insertQuery = "insert into student values(101,'Prathamesh',80,'abc@gmail.com'),"
				+ "(102,'Krishna',65,'ijk@gmail.com'),"
				+ "(103,'Sagar',95,'xyz@gmail.com')";
						
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection created");
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Student table created");
			
			int rowInserted = stmt.executeUpdate(insertQuery);
			if(rowInserted>0)
			{
				System.out.println("new Student record inserted");
			}
			
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}
