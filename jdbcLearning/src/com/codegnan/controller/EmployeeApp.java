package com.codegnan.controller;

import java.util.List;

import com.codegnan.Exceptions.EmployeeNotFoundException;
import com.codegnan.beans.Employee;
import com.codegnan.service.EmployeeService;
import com.codegnan.service.EmployeeServiceImpl;

public class EmployeeApp {
	public static void main(String[] args) {
		
		
		EmployeeService service=new EmployeeServiceImpl();
//		service.addEmployee(new Employee(101,"venkatesh","IT",75000));
//		service.addEmployee(new Employee(102,"rama","net",85000));
//		service.addEmployee(new Employee(103,"srikar","sap",95000));
		
		
		//fetch all details
//		System.out.println("ID\tNAME\tDEPARTMENT\tSALARY");
//		List<Employee>all=service.getAllEmployee();
//		for(Employee e:all) {
//			System.out.println(e);
//		}
		
		
		//find by id
//		System.out.println("ID\tNAME\tDEPARTMENT\tSALARY");
//		try {
//			Employee emp=service.getEmployeeById(101);
//			System.out.println("found: "+emp);
//		} catch (EmployeeNotFoundException e) {
//						e.printStackTrace();
//		}
		
		
		//update 
//		try {
//			service.updateEmployee(new Employee(101,"reddy","sales",60000));
//		} catch (EmployeeNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		//delete
		
		try {
			service.deleteEmployee(101);
			System.out.println("Employee deleted ");
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
	}

}
