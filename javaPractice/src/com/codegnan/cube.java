package com.codegnan;

import java.util.Scanner;

public class cube extends Shape {
	
	public double calculateVolume() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter side value");
		double side=scn.nextDouble();
		double result=side*side*side;
		System.out.println("inside cube");
		
		return  result;
	

}
}
