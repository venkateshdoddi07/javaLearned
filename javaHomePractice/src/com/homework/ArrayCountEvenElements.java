package com.homework;

/* 
 5. Count Number of Even Elements in an Array
 Problem Statement
Write a program to count and print the number of even elements in an array.

Input Format
First line: integer n, number of elements
Next n lines: integers — array elements
*/

import java.util.Scanner;

public class ArrayCountEvenElements {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// enter size of an array
		int size = scn.nextInt();

		int[] array = new int[size];
		// enter array elements
		for (int i = 0; i < array.length; i++) {

			array[i] = scn.nextInt();
		}
		
		//count and print even elements only
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				count++;
				
			}
			
			
		}
		System.out.println(count);
		
		scn.close();
	}

}
