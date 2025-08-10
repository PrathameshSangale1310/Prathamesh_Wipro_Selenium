package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q10 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	String url = "jdbc:mysql://localhost:3306/mynewdb";
        String username = "root";
        String password = "Prathamesh13";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        try {
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE per > 75");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getDouble("per"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
