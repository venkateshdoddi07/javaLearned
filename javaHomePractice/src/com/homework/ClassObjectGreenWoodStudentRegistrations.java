package com.homework;

import java.util.Scanner;

public class ClassObjectGreenWoodStudentRegistrations {
	
	
	
	
	
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	
		System.out.println("enter student name, roll number, grade in integer");
		String name=scn.nextLine();
		int rollNumber=scn.nextInt();
		int grade=scn.nextInt();
		
		
		StudentRegistrationClassFile s1= new StudentRegistrationClassFile(name,rollNumber, grade);
		s1.showProfile();
		

	}
	
	
}
