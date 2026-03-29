package com.codegnan;
import java.util.Scanner;
public class spyNumber {
public static void main(String[] args) {
	
	//spy number===> sum of digits =product of digits
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the number");

	int number=scn.nextInt();
	
	//sum of digits program
	int originalNumber=number;
	int sum=0;	
	
	
	while(number>0) {
		int lastDigit=number % 10;
		sum=sum+lastDigit;
		number/=10;		
	}
	
	//product of digits program
	int product=1;	
	number=originalNumber;
	while(number>0) {
		int lastDigit=number % 10;
		//sum=sum+lastDigit;
		product=product*lastDigit;
		number/=10;		
	}
	 if(sum==product) {
	System.out.println("this is a spy number");
	 }else {
		 System.out.println("this is not a spy number");
	 }
	
	
	scn.close();

}
}
