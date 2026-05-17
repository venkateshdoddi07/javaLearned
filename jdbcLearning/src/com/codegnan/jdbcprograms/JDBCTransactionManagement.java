package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTransactionManagement {
	private static final String driver_name="com.mysql.cj.jdbc.Driver";
	private static final String jdbcUrl="jdbc:mysql://localhost:3306/advjava1";
	private static final String username="root";
	private static final String password="12345678";
	private static final String INSERT_SQL="insert into employee values(?,?,?,?)";
	

	public static void main(String[] args) {
	try(Connection con=DriverManager.getConnection(jdbcUrl,username,password);
			PreparedStatement pst=con.prepareStatement(INSERT_SQL)){
		//1.)disable autocommit mode
		con.setAutoCommit(false);
		try {
			pst.setInt(1,999);
			pst.setString(2, "neha");
			pst.setString(3, "finance");
			pst.setDouble(4, 25000);
			
			int r1=pst.executeUpdate();
			System.out.println(r1+"record1 inserted");
			
			pst.setInt(1,333);
			pst.setString(2, "venky");
			pst.setString(3, "sales");
			pst.setDouble(4, 27000);
			
			int r2=pst.executeUpdate();
			System.out.println(r2+"record2 inserted");
			con.commit();
			System.out.println("transaction committed");
			
		}catch(SQLException e) {
			con.rollback();
			System.out.println("Transaction rollback");
			System.out.println("Error : " +e.getMessage());
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}

		
	}

}
