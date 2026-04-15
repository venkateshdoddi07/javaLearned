package com.codegnan;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter first integer");
		int a=scn.nextInt();
		System.out.println("enter second integer");
		int b=scn.nextInt();
		subClass c1=new subClass(a,b);
		//c1.inputDetails();
		System.out.println("sum of  two integers is: " + c1.addition());
		System.out.println("product of two integers is: "+c1.multiplication());
	}

}
