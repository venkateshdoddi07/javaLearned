package com.codegnan;

/*
Q4) Checking Whether a Number is Positive, Negative, or Zero
Problem:
 Write a Java program to check if a given number is positive, negative using a ternary operator.*/


import java.util.Scanner;

public class FindingNumberType {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter integer number to check positive or netagive or zero");
		int number=scanner.nextInt();
		String result=(number>0)?"positive number":(number<0)?"negative number":(number==0)?"zero number":"not an integer digit";
		
		
		System.out.println("the number you entered is  "+result);
		
		
	}

}
