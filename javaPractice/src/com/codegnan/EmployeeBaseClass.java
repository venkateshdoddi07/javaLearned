package com.codegnan;

public class EmployeeBaseClass {
	String name;
	double basicSalary;
	
	EmployeeBaseClass(String name, double basicSalary){
		super();
		this.name=name;
		this.basicSalary=basicSalary;
		
	}
	public void calculateSalary() {
		System.out.println("basic salary is : "+basicSalary);
	}
	
	

}
