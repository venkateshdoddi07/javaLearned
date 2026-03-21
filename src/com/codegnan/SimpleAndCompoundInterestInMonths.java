/*Write a Java program to calculate Simple Interest and Compound Interest where the time is entered in months.
Input:
Principal amount (double)
Annual rate of interest in percentage (double)
Time in months (int)
Requirements:
Convert time in months to years.
Calculate:
Simple Interest using the formula:
 SI = (Principal × Rate × Time) / 100
Compound Interest using the formula:
 CI = Principal × (1 + Rate/100)^Time − Principal
Print both interests and their corresponding total amounts.
Output:
Time in years (converted from months)

Simple Interest and Total with Simple Interest

Compound Interest and Total with Compound Interest 
====================================================================*/
package com.codegnan;

import java.util.Scanner;
public class SimpleAndCompoundInterestInMonths{

				public static void main(String[] args){

				Scanner scanner=new Scanner(System.in);

				System.out.println("Enter principal amount ");
					double P=scanner.nextDouble();

							System.out.println("Enter rate of Interest");
							double R =scanner.nextDouble();

							System.out.println("Enter time of years in months");
							int T=scanner.nextInt();

								//here we converted months into years
							double convertedTime=T/12;
								//apply both formulas
							double simpleInterest = (P*R*convertedTime)/100;

							double compoundInterest = P* Math.pow((1+(R/100), convertedTime));
								//print as required
							System.out.println("the Simple interest is : "+ simpleInterest);
							System.out.println("the total amount with SI is : " +( simpleInterest+P));
							System.out.println("the Compound interest is : "+ compoundInterest);
							System.out.println("the total amount with CI is : "+( compoundInterest+P));


}}

