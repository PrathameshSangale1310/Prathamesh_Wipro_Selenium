package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q13 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mynewdb";
        String user = "root";
        String password = "Prathamesh13";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();

            int searchId = 854;
            String query = "SELECT * FROM student1 WHERE id = " + searchId;
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Percentage: " + rs.getDouble("percentage"));
                System.out.println("Email: " + rs.getString("email"));
            } else {
                System.out.println("No student found with ID: " + searchId);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
