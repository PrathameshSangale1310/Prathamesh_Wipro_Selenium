package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Q12 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mynewdb";
        String user = "root";
        String password = "Prathamesh13";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO student1 (id, name, percentage, email) VALUES (201, 'Amit', 75, 'amit@example.com')");
            stmt.executeUpdate("INSERT INTO student1 (id, name, percentage, email) VALUES (202, 'Neha', 82, 'neha@example.com')");

            con.commit();
            System.out.println("Transaction committed successfully");

            stmt.close();
            con.close();
        } catch (Exception e) {
            try {
                System.out.println("Transaction is being rolled back");
                if (!e.getClass().getName().equals("java.sql.SQLException")) throw e;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
