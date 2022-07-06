package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create_table {

	public static void main(String[] args) {
		
		try {
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/MyAssignment1", "root","rootpassword");
				
				Statement stmt = conn.createStatement();
				
			
					String sql = "CREATE TABLE Employee" +
			                "(EmpId INTEGER not NULL, " +
			                " EmpName VARCHAR(255), " + 
			                " Designation VARCHAR(255), " + 
			                " age INTEGER, " + 
			                " PRIMARY KEY ( EmpId ))"; 
					
					
					stmt.executeUpdate(sql);
					
					System.out.println("Table Created in MyAssignment1");
					
					conn.close();
					stmt.close();
			
			} catch (SQLException e){
				
				e.printStackTrace();
		}				
	}
	
}
	
	