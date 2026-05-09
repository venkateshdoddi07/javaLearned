package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	
	private static final String driver_name="com.mysql.cj.jdbc.Driver";
	private static final String jdbcUrl="jdbc:mysql://localhost:3306/advjava1";
	private static final String userName="root";
	private static final String password="12345678";
	

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		
		
		try {
			//step-1: load driver
			Class.forName(driver_name);
			
		//step-2 connection establish
			con=DriverManager.getConnection(jdbcUrl,userName,password);
			
		//step 3: create statement
			st=con.createStatement();
		
		//step 4: prepare sql query
		
			String sqlQuery="Create table if not Exists Employee("+"eno int auto_increment primary key,"
																	+"ename varchar(100),"
																	+"esal decimal(10,2),"+
																	"eaddr varchar(100)"+")";
																	
		//step 4: execute sql query
			st.execute(sqlQuery);
			
		System.out.println("employee table created");
	
		} catch (ClassNotFoundException | SQLException e) {
			
			
						e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
