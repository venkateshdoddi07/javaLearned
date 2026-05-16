package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordExample {
	private static final String jdbcUrl = "jdbc:mysql://localhost:3306/advjava1";
	private static final String userName = "root";
	private static final String password = "12345678";

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
				Statement statement = connection.createStatement()) {
			//String sqlQuery = "insert into employee (ename,esal,eaddr) values('malli',50000,'hyd')";
			String sqlQuery = "insert into employee values(115,'mani',75000,'bgl')";
			int rowsAffected= statement.executeUpdate(sqlQuery);
			if(rowsAffected==1) {
				System.out.println("Records inserted succesfully");
			}else {
			System.out.println("Record insertion failure");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
