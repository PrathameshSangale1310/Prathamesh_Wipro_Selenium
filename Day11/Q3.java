package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q3 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mynewdb";
		String user="root";
		String password="Prathamesh13";
			
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection created");
			
			Statement stmt = con.createStatement();
		
			ResultSet rs = stmt.executeQuery("select * from student");
			System.out.println("Rollno \tName \tPer \tEmail");

			while(rs.next())
			{
				int rollno= rs.getInt("rollno");
				String name = rs.getString("name");
				int per = rs.getInt("per");
				String eamil = rs.getString("eamil");
				System.out.println(rollno+" "+name+" "+per+" "+eamil);
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
