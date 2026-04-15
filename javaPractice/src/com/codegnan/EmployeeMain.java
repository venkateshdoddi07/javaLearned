package com.codegnan;

import java.util.Scanner;

public class EmployeeMain{

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		EmployeeInfo e1=new EmployeeInfo();
		e1.inputEmployeeDetails();
		
		e1.displayEmployeeInfo();
		
		System.out.println(e1.calculateSalary());
		
		
		scn.close();
	}

}
