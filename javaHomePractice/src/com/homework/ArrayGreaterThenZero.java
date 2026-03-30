package com.homework;

/*
 Question 11: Count elements greater than zero
 Problem Statement
Write a program to count and print the number of elements greater than zero in an array.
*/
import java.util.Scanner;
public class ArrayGreaterThenZero {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			
			array[i]=scn.nextInt();
		}
		
		int count =0;
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>0) {
				count++;
			}
			
			
		}System.out.println(count);
		
		
		
		scn.close();
		
	}

}
