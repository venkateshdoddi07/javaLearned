package com.codegnan;

public class ContractEmployee extends Employee1 {
	double contractAmount;
	
	
	public ContractEmployee(double contractAmount,String name) {
		super(name);
		this.contractAmount = contractAmount;
	}


	public double calculateSalary() {
		
		return contractAmount;
	}

}
