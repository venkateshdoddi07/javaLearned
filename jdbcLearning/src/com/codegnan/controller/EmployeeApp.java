package com.codegnan.controller;

import java.util.List;
import java.util.Scanner;

import com.codegnan.Exceptions.EmployeeNotFoundException;
import com.codegnan.beans.Employee;
import com.codegnan.service.EmployeeService;
import com.codegnan.service.EmployeeServiceImpl;

public class EmployeeApp {
	public static void main(String[] args) {
		
		
		//EmployeeService service=new EmployeeServiceImpl();
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
		
//		try {
//			service.deleteEmployee(101);
//			System.out.println("Employee deleted ");
//		} catch (EmployeeNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		//using switch
		
		EmployeeService service=new EmployeeServiceImpl();
		Scanner scn=new Scanner(System.in);
		int choice;
		do {
			System.out.println("||-------------------------------------------------||");
			System.out.println("||---------------Employee management system--------||");
			System.out.println("||-------------------------------------------------||");
			System.out.println("||------------1.add employee-----------------------||");
			System.out.println("||------------2.view all employees-----------------||");
			System.out.println("||------------3.fetch employee by id---------------||");
			System.out.println("||------------4.update employee--------------------||");
			System.out.println("||------------5.delete employee--------------------||");
			System.out.println("||------------6.exit-------------------------------||");
			System.out.println("||-------------------------------------------------||");
System.out.println("Enter your choice");
choice=scn.nextInt();
switch(choice) {
case 1: 
	System.out.println("---------------Add employee----------------------");
	System.out.println("Enter employee id: ");
	int id=scn.nextInt();
	scn.nextLine();
	System.out.println("Enter employee name: ");
	String name=scn.nextLine();
	System.out.println("Enter employee department: ");
	String department=scn.nextLine();
	System.out.println("Enter employee salary: ");
	double salary=scn.nextDouble();
	Employee emp=new Employee(id,name,department,salary);
	service.addEmployee(emp);
	System.out.println("Employee added successfully");
	break;
	
	
case 2:
	System.out.println("Employee records");
	List<Employee>employees=service.getAllEmployees();
	System.out.println("-----------------------------------------------------");
	System.out.println("ID\tNAME\tDEPARTMENT\tSALARY");
	System.out.println("------------------------------------------------------");
	for(Employee e:employees) {
		System.out.println(e);
		
	}
	break;

case 3:
	System.out.println("-----------------------fetch employee----------------");
	System.out.println("Enter employee id to search");
	int employeeId=scn.nextInt();
	scn.nextLine();
	try {
	Employee e=service.getEmployeeById(employeeId);
	System.out.println("Employee found ");
	System.out.println("-------------------------------");
	System.out.println("Id: "+e.getId());
	System.out.println("Name: "+e.getName());
	System.out.println("Department: "+e.getDepartment());
	System.out.println("Salary: "+e.getSalary());
	
	
}catch(EmployeeNotFoundException e) {
	e.printStackTrace();
}
	break;
	
case 4:
	System.out.println("-----------------------update employee---------------");
	System.out.println("Enter new employee id: ");
	int updateId=scn.nextInt();
	scn.nextLine();
	System.out.println("Enter new employee name: ");
	String updateName=scn.nextLine();
	System.out.println("Enter new employee department: ");
	String updateDepartment=scn.nextLine();
	System.out.println("Enter new employee salary: ");
	double updateSalary=scn.nextDouble();
	Employee updateEmp=new Employee(updateId,updateName,updateDepartment,updateSalary);
	try {
	service.updateEmployee(updateEmp);
	System.out.println("Employee updated successfully");
	}catch(EmployeeNotFoundException e) {
		e.printStackTrace();
	}
	break;
	
	
case 5:
	System.out.println("---------------delete employee------------------");
	System.out.println("Enter employee id");
	int deleteId=scn.nextInt();
	try {
		service.deleteEmployee(deleteId);
		System.out.println("Employee deleted successfully");
		}catch(EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		break;
	
case 6:
	System.out.println("thank you for using employee management system");
break;


default:
	System.out.println("Invalid choice please try again");

		}
		
	}while(choice!=6);
		scn.close();
	}

}
