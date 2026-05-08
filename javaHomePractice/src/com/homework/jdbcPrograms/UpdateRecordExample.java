package com.homework.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;


public class UpdateRecordExample {
	private static final String jdbcUrl="jdbc:mysql://localhost:3306/advjava";
	private static final String username="root";
	private static final String password="12345678";
	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(jdbcUrl,username,password));
				
				
	}
}
