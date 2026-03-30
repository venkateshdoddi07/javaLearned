package com.homework;
/*1. Print All Elements of an Array
Problem Statement
Write a Java program to print all elements of an array.

Input Format
The first line contains an integer n, the size of the array.
The next n lines each contain one integer — the array elements.*/

import java.util.Scanner;
public class ArrayPrintElements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter size of an array");
		int n=scanner.nextInt();
		int[] array =new int[n];
		
		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.println("the elements you entered are ");
		for(int i=0;i<array.length;i++) {
			System.out.println(" "+ array[i]);
		}
		
		
		
		
		
		
		scanner.close();
		
	}

}
