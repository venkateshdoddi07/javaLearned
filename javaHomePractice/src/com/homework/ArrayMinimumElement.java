package com.homework;

import java.util.Scanner;

public class ArrayMinimumElement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// enter array size
		int size = scn.nextInt();
		int[] array = new int[size];
		// enter all the elements into array
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();    
		}
		// compare each elements of array elements

		int highestValue = array[0];
		for (int i = 0; i < array.length; i++) { 

				if (array[i] < highestValue) { 
					highestValue=array[i];
				}

		}
		System.out.println(highestValue);

		scn.close();

	}

}
