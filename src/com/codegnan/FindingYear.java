
/*Q3) Checking Whether a Year is a Leap Year Problem:
 Write a Java program that checks whether a given year is a leap year or not:
A year is a leap year if it is divisible by 4 and not divisible by 100, except when it is divisible by 400.*/

package com.codegnan;
import java.util.Scanner;

public class FindingYear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year=scanner.nextInt();
		
		if(year%4==0 || (year%100==0 || year%400==0)) {
			
			System.out.println("the entered year "+year+ " is a leap year");
			
		}else {
			
			System.out.println("the entered year "+year+" is not a leap year");
			
		}
		
		
	}

}
