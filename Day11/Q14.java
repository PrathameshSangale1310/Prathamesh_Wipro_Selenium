package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mynewdb";
        String user = "root";
        String password = "Prathamesh13";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, pwd);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful");
            } else {
                System.out.println("Invalid username or password");
            }

            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
