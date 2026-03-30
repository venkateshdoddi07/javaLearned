package com.homework;
/*  Question 12: Print all odd numbers
 Problem Statement
Write a program to print all odd numbers from an array.*/
import java.util.Scanner;

public class ArrayPrintOdd {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		int size=scn.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]=scn.nextInt();
		}
		
		//print odd
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0) {
				System.out.print(array[i]+" ");
			}
			
		}
		
	}

}
