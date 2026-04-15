package com.codegnan;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		Students ug= new underGraduateStudent();
		
		System.out.println("Student id : ");
		ug.setStudentId(scn.nextInt());
		scn.nextLine();
		System.out.println("Student name : ");
		ug.setName(scn.nextLine());
		System.out.println("Student marks : ");
		ug.setMarks(scn.nextInt());
		ug.calculateGrade();
		
		Students pg= new postGraduateStudent();
		System.out.println("Student id : ");
		pg.setStudentId(scn.nextInt());
		scn.nextLine();
		System.out.println("Student name : ");
		pg.setName(scn.nextLine());
		System.out.println("Student marks : ");
		pg.setMarks(scn.nextInt());
		pg.calculateGrade();
		
		
		
	}

}
