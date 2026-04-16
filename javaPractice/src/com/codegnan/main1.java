package com.codegnan;

public class main1 {

	public static void main(String[] args) {
		
		
		Employee1 e1=new FullTimeEmployee(5000, "venk");
		Employee1 e2=new PartTimeEmployee(1000, 20, "arjun");
		Employee1 e3=new ContractEmployee(30000, "mahesh");
		
		
		e1.display();
		System.out.println(e1.calculateSalary());
		
		e2.display();
		System.out.println(e2.calculateSalary());
		
		e3.display();
		
		System.out.println(e3.calculateSalary());
		
		
	}

}
