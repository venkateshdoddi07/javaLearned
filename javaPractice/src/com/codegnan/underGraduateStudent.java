package com.codegnan;



public class underGraduateStudent  extends Students{
	public void calculateGrade() {
		super.calculateGrade();
		double marks=getMarks();
		if(marks>75) {
			System.out.println("UG Student Grade : Distinction");
		}else {
			if(marks>=60) {
				System.out.println("UG Student Grade : First class");
			}else {
				System.out.println("UG Student Grade : pass");
			}
		}
		
		
		
	}

}
