package com.codegnan;

public class StudentDemo {

	public static void main(String[] args) {
		student s1 = new student();
		
		System.out.println("student1 details");
		s1.displayStudentDetails();
		System.out.println("total marks: " + s1.total());
		System.out.println("average marks : " + s1.calculateAverage());

		System.out.println();
		
		int[] marks = { 95, 98, 100 };
		student s2 = new student("malli", 101, marks);

		System.out.println("student2 details");
		s2.displayStudentDetails();
		System.out.println("total marks: " + s2.total());
		System.out.println("average marks : " + s2.calculateAverage());
		System.out.printf("%.2f",s2.calculateAverage());
		

	}

}
