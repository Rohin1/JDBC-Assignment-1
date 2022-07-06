package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete_table {

	public static void main(String[] args) {

    try {
			
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/MyAssignment1", "root","rootpassword");
			
			Statement stmt = conn.createStatement();


			String sql = "DELETE FROM Employee";

			stmt.executeUpdate(sql);
			
			System.out.println("Employee Table Deleted");
			
			conn.close();
			stmt.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
}
