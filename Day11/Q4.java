package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mynewdb";
        String user = "root";
        String password = "Prathamesh13";
        
        Scanner sc = new Scanner(System.in);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection created");
            
            System.out.print("Enter Student ID to search: ");
            int rollNo = sc.nextInt();
            
            Statement stmt = con.createStatement();
            
            String query = "SELECT * FROM student WHERE rollno = " + rollNo;
            

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("Rollno\tName\tEmail");
                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                String email = rs.getString("eamil");
                System.out.println(rollno + "\t" + name + "\t" + email);
            } else {
                System.out.println("No student found with Roll No " + rollNo);
            }

            rs.close();
            stmt.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();

	}

}
