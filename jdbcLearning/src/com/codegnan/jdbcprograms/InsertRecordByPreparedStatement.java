package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecordByPreparedStatement {
	private static final String jdbcUrl="jdbc:mysql://localhost:3306/advjava";
	private static final String userName="root";
	private static final String password="12345678";

	public static void main(String[] args) {
		
		//insert code
//		String sqlQuery="insert into employee values(?,?,?,?)";
//		try(Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
//			PreparedStatement pst=connection.prepareStatement(sqlQuery)){
//			pst.setInt(1, 100);
//			pst.setString(2, "suma");
//			pst.setDouble(3, 90000.00);
//			pst.setString(4, "vijayawada");
//			
//			int rowsAffected=pst.executeUpdate();
//			if(rowsAffected==1) {
//				System.out.println(rowsAffected+"inserted successfully");
//			}else {
//				System.out.println("record insertion failure");
//			}
//			
//			
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
		
		

		//update code
		
	
//		String sqlQuery="update employee set ename=(?) where ename=(?)";
//		try(Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
//			PreparedStatement pst=connection.prepareStatement(sqlQuery)){
//			pst.setString(1, "venk");
//			pst.setString(2,"suma");
//			
//			
//			int rowsAffected=pst.executeUpdate();
//			if(rowsAffected==1) {
//				System.out.println(rowsAffected+"update successfully");
//			}else {
//				System.out.println("record update failure");
//			}
//			
//			
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
			
		
		
		
		//delete code
		
//		String sqlQuery="delete from employee where eno=(?)";
//		try(Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
//			PreparedStatement pst=connection.prepareStatement(sqlQuery)){
//			pst.setInt(1, 100);
//			int rowsAffected=pst.executeUpdate();
//			if(rowsAffected==1) {
//				System.out.println(rowsAffected+"delete successfully");
//			}else {
//				System.out.println("record delete failure");
//			}
	
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
		
		
		//single record selection 
		String sqlQuery="select * from employee where (?)=(?)";
		try(Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
				PreparedStatement pst=connection.prepareStatement(sqlQuery)){
			
			pst.setString(1, "ename");
			pst.setString(2,"malli");
			boolean rowsAffected=pst.execute();
			if(rowsAffected) {
				System.out.println(rowsAffected+"select successfully");
			}else {
				System.out.println("record selected failure");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		//multi-record update

		
		
		
	}

}
