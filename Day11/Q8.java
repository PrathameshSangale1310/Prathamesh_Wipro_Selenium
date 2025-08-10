package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q8 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/mynewdb";
        String username = "root";
        String password = "Prathamesh13";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM employee");

        if (rs.next()) {
            int count = rs.getInt(1);
            System.out.println("Total rows: " + count);
        }

        rs.close();
        st.close();
        con.close();

	}

}
