package com.codegnan;

public class InheritanceManager  extends InheritanceEmployee{
	String department;
	
	InheritanceManager(String name, double salary, String department){
		this.name=name;
		this.salary=salary;
		this.department=department;
				
	}
	
	public void displayManagerDetails() {
		System.out.println("manager details");
		System.out.println("manager name: "+name);
		System.out.println("manager salary "+ salary);
		System.out.println("manager department"+department);
	}
	

}
