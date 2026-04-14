package com.codegnan;

public class Employee {

	int id;
	String name;
	String department;
	
	public Employee() {
		this(0,"unknown");
		System.out.println("default constructor called");
	}
	
	public Employee(int id,String name) {
		this(id,name,"unassigned");
		System.out.println("2- parameter constructor called");
	}
	public Employee(int id,String name,String department) {
		this.id=id;
		this.name=name;
		this.department=department;
		System.out.println("3- parameter constructor called");
	}
	
	
	public void displayInfo() {
		System.out.println("name : "+name);
		System.out.println("id : "+ id);
		System.out.println("department: "+department);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.displayInfo();
		
		System.out.println();
		
		Employee e2=new Employee(101,"arjun");
		e2.displayInfo();
		
	}
	
}
