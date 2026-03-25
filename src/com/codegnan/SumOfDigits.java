package com.codegnan;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		int originalNumber=number;
		int digitSum=0;
		
		while(number>0) {
			int lastDigit=number%10;
			digitSum+=lastDigit;
			number/=10;
			
			
		}
System.out.println("the sum of digits ina given number "+ originalNumber + " is "+ digitSum);
		
		scn.close();
		
		
	}

}
