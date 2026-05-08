package com.homework.jdbcPrograms;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;






public class FetchRecordExample {

	
	private static final String jdbcUrl="jdbc:mysql://localhost:3306/advjava";
	private static final String userName="root";
	private static final String password="12345678";
	
	public static void main(String[] args) {
		
		//insertion code 
		
//		String selectQuery="select * from employe where eno=111";
//		try(Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
//				Statement statement =connection.createStatement();
//				ResultSet rs=statement.executeQuery(selectQuery)) {
//				while(rs.next()) {
//					System.out.println(rs.getInt(1)+"-----"+rs.getString(2)+"--------"
//							+rs.getDouble(3)+rs.getString(4));
//				}
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//			
//		}
		
		
		//update code
		
	
			String updateQuery="update"
	
			try (Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
					Statement statement = connection.createStatement();
					ResultSet rs=statememt.executequery(updateQuery)) {
				
				if (rowsAffected == 1) {
					System.out.println(rowsAffected + " record updated succesfully");
				} else {
					System.out.println("record updataion failure");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			

		
	}

}
