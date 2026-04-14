package com.codegnan;

public class ManagerSubClass extends EmployeeBaseClass {

	
	public ManagerSubClass(String name, double basicSalary) {
		super(name, basicSalary);
	}
	public void calculateSalary(double bonus){
		System.out.println("bonus with salary: "+ (bonus+basicSalary));
		
	
	}
	public void calculateSalary(double bonus,double allowance) {
		System.out.println("double bonus: "+ (bonus+basicSalary+allowance));
	}
	

}
