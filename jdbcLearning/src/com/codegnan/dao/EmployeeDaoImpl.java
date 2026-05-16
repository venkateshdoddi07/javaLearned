package com.codegnan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codegnan.Exceptions.EmployeeNotFoundException;
import com.codegnan.beans.Employee;
import com.codegnan.connection.DBConnection;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee employee) {
String sql="Insert into employee(id,name,department,salary)values(?,?,?,?)";
try(Connection con=DBConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(sql)){
	pst.setInt(1, employee.getId());
	pst.setString(2, employee.getName());
	
	pst.setString(4, employee.getDepartment());
	pst.setDouble(3, employee.getSalary());
	int rowsAffected =pst.executeUpdate();
	if(rowsAffected==1) {
		System.out.println("Employee saved: "+employee);
		
	}else {
		System.out.println("employee record insertion failed");
	}
	
}catch(SQLException e) {
	e.printStackTrace();
}
	}

	@Override
	public List<Employee> findAll() {
List<Employee>list=new ArrayList<>();
String sql="select * from employee";
try(Connection con=DBConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql)){
	while(rs.next()) {
		list.add(new Employee(rs.getInt("id"),rs.getString("name"),rs.getString("department"),rs.getDouble("salary")));
	}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee findById(int id) throws EmployeeNotFoundException {
String sql="select * from employee where id=?";
try(Connection con=DBConnection.getConnection();PreparedStatement pst=con.prepareStatement(sql)){
	pst.setInt(1, id);
	ResultSet rs=pst.executeQuery();
	if(rs.next()) {
		return new Employee(rs.getInt("id"),rs.getString("name"),rs.getString("department"),rs.getDouble("salary"));
	}else {throw new EmployeeNotFoundException("id Not found: "+id);
		
	}
	
}catch(SQLException e) {
	throw new EmployeeNotFoundException("Database error: "+e.getMessage());
}
	}

	@Override
	public void update(Employee employee) throws EmployeeNotFoundException {
		String sql="Update Employee set name=?,department=?,salary=? where id=?";
		try(Connection con=DBConnection.getConnection();
				PreparedStatement pst=con.prepareStatement(sql)){
			pst.setString(1, employee.getName());
			pst.setString(2, employee.getDepartment());
			pst.setDouble(3, employee.getSalary());
			
			int rows=pst.executeUpdate();
			if(rows==0) {
				throw new EmployeeNotFoundException("ID not Found for Update: "+employee.getId());
			}else {
				System.out.println("Employee updated successfully"+employee);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
				
	}

	@Override
	public void deleteById(int id) throws EmployeeNotFoundException {
String sql="delete from employee where id=?";
try(Connection con=DBConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(sql)){
	pst.setInt(1,id);
	int rows=pst.executeUpdate();
	if(rows==0) {
		throw new EmployeeNotFoundException("ID not Found for Update: "+ id);
	}else {
		System.out.println("Employee deleted successfully with id "+id);
	}
}catch(SQLException e) {
	System.out.println("Delete failed: "+e.getMessage());
	
}
	
}
	}
	


