package com.homework;
/* Q5)Checking if a Number is Divisible by 5
Problem:
 Write a Java program to check if a number is divisible by 5 using a ternary operator*/
import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scanner.nextInt();
		String result=(number%5==0)?"divisible by 5":"not divisible by 5";
		
		System.out.println("the entered number is "+ result);
	
	scanner.close();
	
	}

}
