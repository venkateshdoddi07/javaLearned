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
		//count logic 
		int count=0;
		while(n>0) {
			int digitCount=n%10;
			count=count+digitCount;
			n/=10;
		}
		int sum=0;
		int fact=1;
		int o=originalNumber;
		for(int i=0;i<=count;i++) { //count based iterations
			//factorial logic
			int digitFact=o%10;//145
			
			fact=fact*digitFact;
		
			sum=sum+fact;
			o/=10;
			
			
		}
		
		if(sum==originalNumber) {
			System.out.println("this is strong number");
		}else {
			System.out.println("not a strong number");
		}
		
		scn.close();
	}

}
