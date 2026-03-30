package com.homework;

/*10. Print the First Element of an Array
 Problem Statement
Write a program to print the first element of an array.*/
import java.util.Scanner;
public class ArrayFirstElement {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);

	int size=scn.nextInt();
	int[] array=new int[size];
	for(int i=0;i<array.length;i++) {
		
		array[i]=scn.nextInt();
	}
	
	int firstElement=array[0];
	
	System.out.println(firstElement);


scn.close();
	}

}
