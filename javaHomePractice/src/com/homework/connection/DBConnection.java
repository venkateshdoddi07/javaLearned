package com.homework.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String jdbcurl="jdbc:mysql://localhost:3306/advjava";
	private static final String username="root";
	private static final String password="12345678";
	
	private static Connection getConnection() {
		Connection con=null;
		try {
			con= DriverManager.getConnection(jdbcurl,username,password);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return con;
	}

}
