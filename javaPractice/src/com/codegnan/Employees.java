package com.codegnan;

public class Employees {

	private int  employeeId;
	private String name;
	private double salary;
	
 Employees(int employeeId,String name,double salary) {
	 
	this.employeeId=employeeId;
	this.name=name;
	this.salary=salary;
	 
 }
 

 
 public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
 }

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
 }

 public double getSalary() {
	return salary;
 }


	
 public void setSalary(double salary) {
	 if(salary>0) {
		 this.salary=salary;
	 }else {
		 System.out.println("salary must be positive");
	 }
 }
	
	void displayEmployeeInfo() {
		
		
		System.out.println("employee id is : " + employeeId);
		System.out.println("Employee name is : "+ name);
		System.out.println("Employee salary is : "+salary);
	}
	
	
	
}
