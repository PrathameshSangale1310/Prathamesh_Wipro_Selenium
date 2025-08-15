package Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Hospital {

	public static void main(String[] args) throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Prathamesh13";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			Statement stmt = con.createStatement();
			
	        
	        CallableStatement cst1 = con.prepareCall("{CALL avg_pat2()}");
	        
	        ResultSet rs = cst1.executeQuery();
	   	 
	        System.out.println("Average number of patients:");
            while (rs.next()) {
                double avgPatients = rs.getDouble("a");
                System.out.println("Average: " + avgPatients);
            }
            
            
	        
	        CallableStatement cst2 = con.prepareCall("{CALL sameward(?)}");
            cst2.setString(1, "ward a");
            ResultSet rs2 = cst2.executeQuery();

            System.out.println("\nPatients in 'ward a':");
            System.out.println("Name\tWard\tAdm\t\tNo. of Patients");
            System.out.println("-------------------------------------------------");
            while (rs2.next()) {
                String name = rs2.getString("name");
                String ward = rs2.getString("ward");
                String adm = rs2.getString("adm");
                int noofpatients = rs2.getInt("noofpatients");

                System.out.printf("%s\t%s\t%s\t%d\n", name, ward, adm, noofpatients);
            }
	        
	        CallableStatement cst3 = con.prepareCall("{CALL arrange1()}");
	        ResultSet rs3 = cst3.executeQuery();
	        System.out.println("\nAll records sorted by date:");
            System.out.println("Name\tWard\tAdm\t\tNo. of Patients");
            System.out.println("-------------------------------------------------");
            while (rs3.next()) {
                String name = rs3.getString("name");
                String ward = rs3.getString("ward");
                String adm = rs3.getString("adm");
                int noofpatients = rs3.getInt("noofpatients");

                System.out.printf("%s\t%s\t%s\t%d\n", name, ward, adm, noofpatients);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}