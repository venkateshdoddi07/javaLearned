package com.homework;

public class ClassObjectStudentData {

	public static void main(String[] args) {
		
		StudentClass s1=new StudentClass();
		System.out.println("student 1 details are below : ");
		s1.displayDetails();
		System.out.println("calculate total : " + s1.CalculateTotal());
		System.out.println("calculate average : " + s1.CalculateAverage());
		
		System.out.println();
		
		
		int[] marks= {90,80,70};
		StudentClass s2=new StudentClass("venkatesh",01,marks);
		System.out.println("student 2 details are below : ");
		s2.displayDetails();
		System.out.println("calculate total : " + s2.CalculateTotal());
		System.out.println("calculate average : " +s2.CalculateAverage());
	}

}
