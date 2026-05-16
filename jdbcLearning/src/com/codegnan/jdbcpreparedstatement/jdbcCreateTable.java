package com.codegnan.jdbcpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcCreateTable {
	
	//to create a table via jdbc
	
	private static final String driverName="com.mysql.cj.jdbc.Driver";
	private static final String jdbcUrl="jdbc:mysql://localhost:3306/advjava1";
	private static final String username="root";
	private static final String password="12345678";
	

	public static void main(String[] args) {
		//to create a table in main
		Connection con=null;
		Statement st=null;
		
		try {
			Class.forName(driverName);
			con=DriverManager.getConnection(jdbcUrl,username,password);
			st=con.createStatement();
			String sqlQuery="CREATE TABLE DEPARTMENT(DEPT_NO INT AUTO_INCREMENT PRIMARY KEY, DEPT_NAME VARCHAR(50), DEPT_LOC VARCHAR(30),ENO int,FOREIGN KEY(ENO) REFERENCES EMPLOYEE(ENO))";
			
			st.execute(sqlQuery);
			System.out.println("table created");
		}catch(SQLException |ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			if(con!=null) {
				try {
				con.close();
				}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}}
