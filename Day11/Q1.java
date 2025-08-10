package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Q1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/mynewdb";
		String user="root";
		String password="Prathamesh13";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection created");
		

	}

}
