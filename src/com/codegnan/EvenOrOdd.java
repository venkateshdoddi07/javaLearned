//Q2)Check if a Number is Even or OddProblem: Write a Java program that checks whether a number entered by the user is even or odd.

package com.codegnan;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		
Scanner scn=new Scanner(System.in);
System.out.println("Enter the number to know its or or even");

long number = scn.nextLong();
if(number%2==0) {
	System.out.println("the number you entered is even");
}else {
	System.out.println("the number you entered is odd");
}

	}

}
