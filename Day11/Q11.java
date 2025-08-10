package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Q11 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mynewdb";
        String user = "root";
        String password = "Prathamesh13";

        String createTableQuery = "CREATE TABLE IF NOT EXISTS student1 ("
                + "id INT PRIMARY KEY, "
                + "name VARCHAR(50), "
                + "percentage DOUBLE, "
                + "email VARCHAR(50))";
        
        
        String query = "INSERT INTO student1 (id, name, percentage, email) VALUES (?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTableQuery);
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, 101);
            pstmt.setString(2, "Prathamesh");
            pstmt.setDouble(3, 80);
            pstmt.setString(4, "prathamesh@gmail.com");
            pstmt.executeUpdate();

            pstmt.setInt(1, 102);
            pstmt.setString(2, "Krishna");
            pstmt.setDouble(3, 85);
            pstmt.setString(4, "krishna@gmail.com");
            pstmt.executeUpdate();

            pstmt.setInt(1, 103);
            pstmt.setString(2, "Sagar");
            pstmt.setDouble(3, 90);
            pstmt.setString(4, "sagar@gmail.com");
            pstmt.executeUpdate();

            pstmt.close();
            con.close();

            System.out.println("Records inserted successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}