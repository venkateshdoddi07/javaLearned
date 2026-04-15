package com.codegnan;

import java.util.Scanner;

public class EmployeeInfo extends Employeee{
	double salaryPerYear;
	
	public EmployeeInfo() {
		super("","",0);
	}





	public void inputEmployeeDetails() {
		Scanner scn=new Scanner(System.in);
		System.out.println("employee name: ");
		employeeName=scn.nextLine();
		System.out.println("employee design ");
		designation=scn.next();
		System.out.println("employee years of experience: ");
		yearsOfExperience=scn.nextInt();
		
		
		System.out.println("Enter salary per year");
		salaryPerYear=scn.nextDouble();
		
	}
	public void displayEmployeeInfo() {
		System.out.println("employee name: "+ employeeName);
		System.out.println("designation is : "+ designation);
		System.out.println("years of experience: "+yearsOfExperience);
		
		
	}
	
	public double calculateSalary() {
		return (salaryPerYear*yearsOfExperience);
		
	}

}
