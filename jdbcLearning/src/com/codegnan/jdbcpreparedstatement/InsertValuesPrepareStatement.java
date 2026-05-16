package com.codegnan.jdbcpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertValuesPrepareStatement {
	private static final String jdbcUrl="jdbc:mysql://localhost:3306/advjava1";
	private static final String username="root";
	private static final String password="12345678";
	
	

	public static void main(String[] args) {
		
		//records insertion code
//		String sqlQuery="insert into department(dept_name,dept_loc,eno) values(?,?,?)";
//		
//		try(Connection con=DriverManager.getConnection(jdbcUrl,username,password);
//				PreparedStatement pst=con.prepareStatement(sqlQuery)){
//				pst.setString(1, "python");
//				pst.setString(2, "bng");
//				pst.setInt(3, 116);
//				int rowsAffected=pst.executeUpdate();
//				if(rowsAffected==1) {
//					System.out.println("record inserted success");
//				}else {
//					System.out.println("record insertion failed");
//				}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		
		//record update code
//		String sqlQuery="update department set dept_loc=(?) where dept_loc=(?)";
//		try(Connection con=DriverManager.getConnection(jdbcUrl,username,password);
//				PreparedStatement pst= con.prepareStatement(sqlQuery)){
//			pst.setString(1,"vizag");
//			pst.setString(2, "del");
//			int rowsAffected=pst.executeUpdate();
//			if(rowsAffected==1) {
//				System.out.println("record updated done");
//			}else {
//				System.out.println("record updated failed");
//			}
//				
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
				
		
	//record delete code
		
		String sqlQuery="delete from department where dept_no=(?)";
		try(Connection con=DriverManager.getConnection(jdbcUrl,username,password);
				PreparedStatement pst=con.prepareStatement(sqlQuery)){
			pst.setInt(1,3);
			int rowsAffected=pst.executeUpdate();
			
			if(rowsAffected==1) {
				System.out.println("deleted");
			}else {
				System.out.println("failed");
			}
		}
				catch(SQLException e) {
		e.printStackTrace();
	}

}}
