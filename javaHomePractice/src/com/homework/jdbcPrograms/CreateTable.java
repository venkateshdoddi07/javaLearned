package com.homework.jdbcPrograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
private static final String driver_name="com.mysql.cj.jdbc.Driver";
private static final String jdbcUrl="jdbc:mysql://localhost:3306/advjava";
private static final String userName="root";
private static final String password="12345678";
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			//1. load and register Driver
			Class.forName(driver_name);
			// 2. Establish Connection
			con=DriverManager.getConnection(jdbcUrl, userName, password);
			//3. create statement
			st=con.createStatement();
			// 4. prepare sql query
			String sqlQuery = "CREATE TABLE IF NOT EXISTS EMPLOYEE("
					+ "ENO INT AUTO_INCREMENT PRIMARY KEY,"
							+ "ENAME VARCHAR(100),"
									+ "ESAL DECIMAL(10,2),"
										+ "EADDR VARCHAR(100)" + ")";
            // 5 execute SQL query
			st.execute(sqlQuery);
			System.out.println("Employee table created succesfully");
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}finally {
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
