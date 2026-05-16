package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class UpdateRecordExample {

private static final String jdbcurl="jdbc:mysql://localhost:3306/advjava1";
private static final String username="root";
private static final String password="12345678";
	public static void main(String[] args) {
		try (
			Connection con=DriverManager.getConnection(jdbcurl,username,password);
			Statement st=con.createStatement()){
			String updateQuery="update employee set ename='mani',esal=70000,eaddr='vizag'"+ "where eno=111";
			int rowsAffected=st.executeUpdate(updateQuery);
			if(rowsAffected==1) {
				System.out.println(rowsAffected+"record updated successfully");
			}else {
				System.out.println("record updation failed");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
				
				
	}
}
