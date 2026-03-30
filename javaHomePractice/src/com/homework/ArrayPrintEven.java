package com.homework;

import java.util.Scanner;

/*Question 13: Sum of all even numbers
 Problem Statement
Write a program to calculate and print the sum of all even numbers in an array.*/
public class ArrayPrintEven {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		int size=scn.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			
			array[i]=scn.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]%2==0) {
				sum+=array[i];
			}
		}
		System.err.println(sum);
		
		
		
	}

}
