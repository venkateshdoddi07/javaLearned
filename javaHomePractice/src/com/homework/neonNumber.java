package com.homework;
/*
 a number where the sum of digits of its square is equal to original number
Number = 9

Square = 9 * 9 = 81

81 % 10 = 1  
81 / 10 = 8  

1 + 8 = 9

 */


import java.util.Scanner;
public class neonNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(); //9
		int originalNumber=number;
		//square of the number
		int squareValue=number*number; //81
		int sumOfSquare=0;
		
		//sum of that square number == original number
		while(squareValue!=0) {
			int digit =squareValue%10;//81%10=8
			sumOfSquare+=digit;
			squareValue/=10;//
					
		}
		if (sumOfSquare == originalNumber) {
		    System.out.println("Neon Number");
		} else {
		    System.out.println("Not a Neon Number");
		}
			scn.close();
	}

}
