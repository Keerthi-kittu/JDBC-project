package com.jdbc;
import javax.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {
	 static final String url = "jdbc:mysql://localhost:3306/college"; // database name
    static final String username = "root";
    static final String password = "root";
	

	public static void main(String[] args) {
		System.out.println("started");
		// TODO Auto-generated method stub
		try {
            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // 3. Create SQL query
            String sql = "CREATE TABLE student (" +
                         "id INT PRIMARY KEY, " +
                         "name VARCHAR(50), " +
                         "age INT, " +
                         "department VARCHAR(30))";
            // 4. Execute query
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("Table created successfully!");

            // 5. Close connection
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




