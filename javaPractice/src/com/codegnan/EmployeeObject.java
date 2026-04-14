package com.codegnan;

import java.util.Scanner;

public class EmployeeObject {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Employees e1=new Employees(0,null,0);
		
		e1.displayEmployeeInfo();
		
		
		int EmpId=scn.nextInt();
		String EmpName=scn.next();
		double EmpSalary=scn.nextDouble();

		
		e1.setEmployeeId(EmpId);
		e1.setName(EmpName);
		e1.setSalary(EmpSalary);
		e1.displayEmployeeInfo();
		
		
		
		
		
	}

}
