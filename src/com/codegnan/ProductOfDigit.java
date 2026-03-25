package com.codegnan;
import java.util.Scanner;

public class ProductOfDigit {
public static void main(String[] args) {
	
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter the number");
		int number=scn.nextInt();
		int originalNumber=number;
		int product=1;
		
		while(number>0) {
			int lastDigit=number % 10;
			product=product*lastDigit;
			number/=10;
			
			
			
		}
		System.out.println("the product of the entered digit " + originalNumber + "is " + product);
			
		
	
}
}
