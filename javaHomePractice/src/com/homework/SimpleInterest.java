//Write a Java program to calculate Simple Interest and Total Amount.
//Input values should include: Principal (double)
//Rate of Interest in % (double)
//Time in years (double)
//Use the formula: Simple Interest = (P × R × T) / 100
//Display the interest and total amount.
//System.out.printf("Area of the circle = %.2f\n", area);
package com.homework;

import java.util.Scanner;
public class SimpleInterest{
public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Principal amount in double");
				//P = principal amount
		double P=scn.nextDouble();

		System.out.println("Enter its Rate of interest in double");
				//R= Rate of Interest in "%" use double	
		double R=scn.nextDouble();

		System.out.println("Enter for how many years you want in double");
				//T=Time in years "i didnt understand"
		double T= scn.nextDouble();

		System.out.println();
				//simple interest formula : SI=(P X R X T)/100

		double SI=(P*R*T)/100;
				//print Interest and total amount

		System.out.println("the simple interest is : "+ SI);
		System.out.println("the total amount after interest is: "+ (SI+P));
		//Syso ("Area of circle = %.2f\n",area);

}
}

