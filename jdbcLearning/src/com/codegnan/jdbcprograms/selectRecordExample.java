package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectRecordExample {
	
	private static final String jdbcurl="jdbc:mysql://localhost:3306/advjava1";
	private static final String username="root";
	private static final String password="12345678";
	

	public static void main(String[] args) {
		
		
try(Connection con=DriverManager.getConnection(jdbcurl,username,password);
		Statement st=con.createStatement()
		){
	String selectQuery="select * from employee";
	ResultSet resultSet=st.executeQuery(selectQuery);
	System.out.println("Eno\tEname\tEsal\tEaddr");

	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getDouble(3)+"\t"+resultSet.getString(4));
		
	}	
}catch(SQLException e) {
	e.printStackTrace();
}
	}

}
