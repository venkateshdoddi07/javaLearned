package com.codegnan.java8;

public class AssertExample {

	public static void main(String[] args) {
		
		int marks=100;
		assert(marks<200):"marks cannot exceed "+marks;
		System.out.println("Marks "+ marks);
		
	}

}
