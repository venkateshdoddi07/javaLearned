package com.codegnan;
import java.util.Scanner;

public class StudentDetails{
	public static void main(String[] args){
	
	Scanner scn=new Scanner(System.in);
	
	System.out.println("enter student name");
	String stdName=scn.next();

	System.out.println("enter student age");
	int stdAge=scn.nextInt();

	System.out.println("enter student marks");
	double stdMarks=scn.nextDouble();

	System.out.println("enter gender");
	char gender=scn.next().charAt(0);


	System.out.println("the student name is: " + stdName);
	System.out.println("the student age is : " + stdAge);
	System.out.println(" the student marks are: " + stdMarks);
	System.out.println(" the student gender is : " + gender);

       }
}
