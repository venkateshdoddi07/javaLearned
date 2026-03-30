package com.homework;

/*3. Find Maximum Element in an Array
 Problem Statement
Write a program to find and print the maximum element in an array.

Input Format
First line: integer n — size of array
Next n lines: integers — array elements*/
import java.util.Scanner;

public class ArrayMaximumElement {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// enter array size
		int size = scn.nextInt();
		int[] array = new int[size];
		// enter all the elements into array
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();    //9,8,7,6
		}
		// compare each elements of array elements

		int highestValue = array[0]; //here first i took 0 but negative values are not working
		for (int i = 0; i < array.length; i++) { //index: 0,1,2,3--->9,8,7,6

				if (array[i] > highestValue) { //9>0,8>9(false),....
					highestValue=array[i];// highestValue=9
				}

		}
		System.out.println(highestValue);

		scn.close();

	}

}
