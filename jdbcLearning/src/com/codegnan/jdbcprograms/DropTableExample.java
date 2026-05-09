package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTableExample {
	
	private static final String jdbcUrl="jdbc:mysql://localhost:3306/advjava1";
	private static final String userName="root";
	private static final String password="12345678";
	
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(jdbcUrl,userName,password);
				Statement st=con.createStatement()){
			
			
			String sqlQuery="drop table employee";
			st.executeUpdate(sqlQuery);
			System.out.println("table drop successfully");
		
	}catch(SQLException e) {
		e.printStackTrace();
	}

}}
