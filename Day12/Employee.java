package Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Prathamesh13";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			Statement stmt = con.createStatement();
			
	        
	        CallableStatement cst1 = con.prepareCall("{CALL getdetails6()}");
	        CallableStatement cst2 = con.prepareCall("{CALL addbonus()}");

	        CallableStatement cst3 = con.prepareCall("{CALL highest2()}");

	        CallableStatement cst4 = con.prepareCall("{CALL lowest2()}");
	        
	        CallableStatement cst5 = con.prepareCall("{CALL samename3()}");

	        ResultSet rs0 = cst1.executeQuery();
	        System.out.println("ID\tName\t\t\tSalary");
	        System.out.println("------------------------------------");
	 
	        while (rs0.next()) {
	            int id = rs0.getInt("id");
	            String name = rs0.getString("name");
	            int salary = rs0.getInt("salary");
	 
	            System.out.printf("%d\t%-20s\t%d\n", id, name, salary);
	        }
	        
	        
	        ResultSet rs1 = cst2.executeQuery();
	        System.out.println("ID\tName\t\t\tSalary Updated with bonus");
	        System.out.println("------------------------------------");
	 
	        while (rs1.next()) {
	            int id = rs1.getInt("id");
	            String name = rs1.getString("name");
	            int salary = rs1.getInt("salary");
	 
	            System.out.printf("%d\t%-20s\t%d\n", id, name, salary);
	        }
	        
	        ResultSet rs4 = cst5.executeQuery();
	        System.out.println("Name\tCount");
	        System.out.println("------------------------------------");
	 
	        while (rs4.next()) {
	            String name = rs4.getString("name");
	            int c = rs4.getInt("c");
	 
	            System.out.printf(name," ", c);
	        }
	        
	        
	        ResultSet rs2 = cst3.executeQuery();
	        System.out.println("------------------------------------");
	 
	        while (rs2.next()) {
	            
	            String S = rs2.getString("S");
	            
	 
	            System.out.printf("Highest salary is: "+S);
	        }
	        
	        
	        ResultSet rs3 = cst4.executeQuery();
	        System.out.println("------------------------------------");
	   	 
	        while (rs3.next()) {
	            
	            String m = rs3.getString("m");
	            
	 
	            System.out.printf("Lowest salary is: "+m);
	        }
	 
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	}