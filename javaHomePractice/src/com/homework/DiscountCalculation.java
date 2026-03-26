/*Q7)  Discount Calculation
Problem:
 Write a Java program to apply a discount based on the total shopping amount using a ternary operator:
20% discount if the total amount is greater than or equal to 1000
10% discount if the total amount is between 500 and 999
No discount if the amount is less than 500*/

package com.homework;
import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter total amount");
		int amount=scn.nextInt();
		double discount=0;
		double total=(amount>=1000)?(total=amount-amount/20):
						(amount>=500 && amount<=999)?(total=amount-amount/10):
						(amount<=500)?amount:amount;
		
		System.out.println(total);
	}

}
