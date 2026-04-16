package com.codegnan;

public class FullTimeEmployee extends Employee1 {
	double monthlySalary;
	
	
	public FullTimeEmployee(double monthlySalary,String name) {
		super(name);
		this.monthlySalary = monthlySalary;
	}


	@Override
	public double calculateSalary() {
		
		return monthlySalary;
	}


	
	
	
	
	
}
