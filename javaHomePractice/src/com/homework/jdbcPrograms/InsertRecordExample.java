package com.homework.jdbcPrograms;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordExample {
	private static final String jdbcUrl = "jdbc:mysql://localhost:3306/advjava";
	private static final String userName = "root";
	private static final String password = "12345678";

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
				Statement statement = connection.createStatement()) {
			//String sqlQuery = "insert into employee values(111,'malli',50000,'hyd')";
			String sqlQuery = "insert into employee values(222,'mani',75000,'bgl')";
			int rowsAffected= statement.executeUpdate(sqlQuery);
			if(rowsAffected==1) {
				System.out.println("Recxords inserted succesfully");
			}else {
			System.out.println("Record insertion failure");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
