package com.codegnan;
import java.util.Scanner;

public class Countdigits {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);

System.out.println("Enter the digit");

int number=scn.nextInt();
int originalNumber=number;

int count =0;
while(number!=0) {
	
	number=number/10;
	count++;
	
}
System.out.println("the count of the given number digits are "+originalNumber+ " is " + count);


	}

}
