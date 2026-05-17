package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

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
			pst.setInt(1,444);
			pst.setString(2, "doddi");
			pst.setString(3, "it");
			pst.setDouble(4, 85000);
			
			int r1=pst.executeUpdate();
			System.out.println(r1+"record1 inserted");
			
			
			pst.setInt(1,555);
			pst.setString(2, "moni");
			pst.setString(3, "banking");
			pst.setDouble(4, 31000);
			
			int r2=pst.executeUpdate();
			System.out.println(r2+"record2 inserted");
			Savepoint sp=con.setSavepoint("after two");
		System.out.println("save point created");
		try {
			pst.setInt(1,111);
			pst.setString(2, "harika");
			pst.setString(3, "python");
			pst.setDouble(4, 23000);
			int r3=pst.executeUpdate();
			System.out.println(r3+"record3 inserted");
		}catch(SQLException e) {
			System.out.println("Insert record 3 failure"+e.getMessage());
			con.rollback(sp);
		}
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
