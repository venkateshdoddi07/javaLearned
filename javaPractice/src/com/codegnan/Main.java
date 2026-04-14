package com.codegnan;

public class Main {

	public static void main(String[] args) {

		
			EmployeeBaseClass emp1=new EmployeeBaseClass("venk", 1000);
			emp1.calculateSalary();
			
			
			ManagerSubClass mgr1=new ManagerSubClass("suma", 1000);
			
			mgr1.calculateSalary();
			mgr1.calculateSalary(5000);
			mgr1.calculateSalary(5000,7000);
			
	}

}
