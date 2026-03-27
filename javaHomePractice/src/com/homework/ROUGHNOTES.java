package com.homework;

import java.util.Scanner;

public class ROUGHNOTES {
	//sum of digits =products of digits

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();//1153
		int on=n;
		int sum=0;
		int product=1;
		
		//sum calculation
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			n/=10;
		}
		
		n=on;
		//product calculation
		while(n>0) {
			int productdigit=n%10;
			product=product*productdigit;
			n/=10;
		}
			
		//spy formula
		if(sum==product) {
			System.out.println("the given number is spy number");
		}else {
			System.out.println("the given number is not a spy number");
		}
		
		
	
			
		scn.close();
	}

}
