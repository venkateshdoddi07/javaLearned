package com.homework;
/*7. Product of All Elements in an Array
 Problem Statement
Write a program to calculate and print the product of all elements in an array.*/
import java.util.Scanner;
public class ArrayProductElements {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			
			array[i]=scn.nextInt();
		}
		
		int product=1;
		//product logic
		for(int i=0;i<array.length;i++) {
			product=product*array[i];

		}
		System.out.println(product);
		
		
		
		scn.close();
	}

}
