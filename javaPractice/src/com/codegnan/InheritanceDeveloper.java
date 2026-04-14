package com.codegnan;

public class InheritanceDeveloper extends InheritanceEmployee {
	String programmingLanguage;
	public InheritanceDeveloper(String name,double salary,String programmingLanguage) {
		this.name=name;
		this.salary=salary;
		this.programmingLanguage=programmingLanguage;
		
	}
	public void displayDeveloperDetails() {
		System.out.println("manager details");
		System.out.println("name : " + name);
		System.out.println("salary : "+salary);
		System.out.println("programming language : "+ programmingLanguage);
	}

}
