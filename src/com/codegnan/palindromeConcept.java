package com.codegnan;

import java.util.Scanner;

public class palindromeConcept {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the number");
		
	int number =scanner.nextInt();
	int  originalNumber=number;
	int reverseNumber=0;
	if(number<0) {
		
		number=-(number);
	}
	
	while(number>0) {
		int lastDigit=number % 10;
		reverseNumber=reverseNumber*10 +lastDigit;
		number /=10;
		
		
	}
	if(originalNumber==reverseNumber) {
		System.out.println(originalNumber+" number is palindrome");
	}else {
		System.out.println(originalNumber+" not a palindrome");
	}
	scanner.close();
	}
	}


