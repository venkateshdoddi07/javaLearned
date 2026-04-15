package com.codegnan;

import java.util.Scanner;

public class cuboid extends Shape {
	public double calculateVolume() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter length,width,height");
		double length=scn.nextDouble();
		double width=scn.nextDouble();
		double height=scn.nextDouble();
		
		System.out.println("the total cuboid is");
		double result=length*width*height;
		
		return result;
	}

}
