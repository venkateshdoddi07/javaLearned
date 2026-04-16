package com.codegnan;

public abstract class Employee1 {
	String name;

	public Employee1(String name) {
		super();
		this.name = name;
	}
	
	public abstract double calculateSalary();
	
	void display() {
		System.out.println(name);
	}

}
