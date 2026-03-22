//Q1)Write a Java program that prompts the user for a character, converts it to its ASCII value, and displays the result.


package com.codegnan;

import java.util.Scanner;

public class AsciiValueConversion {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter any character to print the ascii value");
		char Ascii=scn.next().charAt(0);
		
		int result= (int)Ascii;
		
		System.out.println("the ascii value is"+result);
	
	}

}
