package com.codegnan;

public class PartTimeEmployee extends Employee1{
	double hourlyRate;
	int hoursWorked;
	
	
	public PartTimeEmployee(double hourlyRate, int hoursWorked,String name) {
		super(name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		
	}


public double calculateSalary() {
		
		return hourlyRate*hoursWorked;
		
	}

}
