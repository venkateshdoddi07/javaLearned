package com.homework;


/*
 A number is called a Strong Number if the sum of the factorials of its digits is equal to the number.
 
 Number = 145

Digits: 1, 4, 5

1! = 1  
4! = 24  
5! = 120  

1 + 24 + 120 = 145
 */
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();//145
		
		int originalNumber=n;
		int sum=0;
		int fact=1;
		
		while(n>0) {
			int digit=n%10;//5
			fact=fact*digit;
			digit--;
			sum=sum+fact;
			
		}
		if(sum==originalNumber) {
			System.out.println("th is strong number");
		}else {
			System.out.println("not a strong number");
		}
		
		scn.close();
	}

}
