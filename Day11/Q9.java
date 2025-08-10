package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q9 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mynewdb";
        String user = "root";
        String password = "Prathamesh13";

        String sql = "create table if not exists student(rollno int, name varchar(50), per int, eamil varchar(50))";
        String insertQuery = "insert into student values(101,'Prathamesh',80,'abc@gmail.com'),"
                + "(102,'Krishna',65,'ijk@gmail.com'),"
                + "(103,'Sagar',95,'xyz@gmail.com')";
        String sortQuery = "select * from student order by name asc";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.executeUpdate(insertQuery);
            ResultSet rs = stmt.executeQuery(sortQuery);
            System.out.println("Rollno\tName\tPer\tEmail");
            while (rs.next()) {
                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                int per = rs.getInt("per");
                String email = rs.getString("eamil");
                System.out.println(rollno + "\t" + name + "\t" + per + "\t" + email);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
