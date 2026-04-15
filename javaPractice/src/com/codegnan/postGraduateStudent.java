package com.codegnan;

public class postGraduateStudent extends Students {
	public void calculateGrade() {
		super.calculateGrade();
		double marks=getMarks();
		if(marks>80) {
			System.out.println("PG Student Grade : Distinction");
		}else {
			if(marks>=65) {
				System.out.println("PG Student Grade : First class");
			}else {
				System.out.println("PG Student Grade : pass");
			}
		}
		
		
		
	}
}
