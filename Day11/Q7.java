package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q7 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mynewdb";
        String user = "root";
        String password = "Prathamesh13";
        
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection created");

            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS employee ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "salary DOUBLE, "
                    + "email VARCHAR(50))";
            stmt.executeUpdate(sql);
            System.out.println("Employee table created");

            String insertQuery = "INSERT INTO employee (id, name, salary, email) VALUES "
                    + "(101, 'Prathamesh', 50000, 'abc@gmail.com'), "
                    + "(102, 'Krishna', 45000, 'ijk@gmail.com'), "
                    + "(103, 'Sagar', 60000, 'xyz@gmail.com')";
            int rowsInserted = stmt.executeUpdate(insertQuery);
            if (rowsInserted > 0) {
                System.out.println("New employee records inserted");
            }

            String updateQuery = "UPDATE employee SET salary=48000 WHERE id=102";
            int rowsUpdated = stmt.executeUpdate(updateQuery);
            if (rowsUpdated > 0) {
                System.out.println("Employee record updated");
            }

            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            System.out.println("\nID\tName\t\tSalary\t\tEmail");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                String email = rs.getString("email");
                System.out.println(id + "\t" + name + "\t\t" + salary + "\t" + email);
            }
            rs.close();

            String deleteRow = "DELETE FROM employee WHERE id=102";
            int rowsDeleted = stmt.executeUpdate(deleteRow);
            if (rowsDeleted > 0) {
                System.out.println("\nDeleted employee with ID=102");
            }

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}