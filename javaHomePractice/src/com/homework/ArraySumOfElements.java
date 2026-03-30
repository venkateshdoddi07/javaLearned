package com.homework;

/*2. Sum of All Elements in an Array
 Problem Statement
Write a program to calculate and print the sum of all elements in an array.

Input Format
First line: integer n, the number of elements.
Next n lines: each line contains one integer (the array elements).*/
import java.util.Scanner;
public class ArraySumOfElements {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		//enter sizer of an array
		int size=scn.nextInt();
		
		//created array object with size
		int[] array=new int[size];
		
		//assigning elements here
		for(int i=0;i<size;i++) {
			array[i]=scn.nextInt();
		}
		
		//sum of all entered array logic
		int sum=0;
		
		for(int i=0;i<size;i++) {
			sum=sum+array[i];
		}
		
		System.out.println("the total sum of array elements is "+ sum);
	}

}
