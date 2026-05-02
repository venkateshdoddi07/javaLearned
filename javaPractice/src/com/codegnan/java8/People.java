package com.codegnan.java8;

public class People{
	String name;
	int age;
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
	

}
