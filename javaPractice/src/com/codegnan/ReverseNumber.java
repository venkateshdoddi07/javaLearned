package com.codegnan;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the number");
		
	int number =scanner.nextInt(); //543
	int reverseNumber=0;
	if(number<0) {
		
		number=-(number);
	}
	
	while(number>0) {
		int lastDigit=number % 10;//345
		reverseNumber=reverseNumber*10 +lastDigit; //0+3,3*10 +4=34--->34*10=340+5=345
		number /=10;//0
		
		
	}
	
	
	System.out.println("the reverse of the given number is "+ reverseNumber);
	scanner.close();
	}

}
