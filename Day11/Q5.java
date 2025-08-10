package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/mynewdb";
        String user = "root";
        String password = "Prathamesh13";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            String query = "UPDATE student SET per=90 where rollno=103";

            int rows = stmt.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Student details updated successfully!");
            }

            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}