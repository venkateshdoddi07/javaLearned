package com.homework;

import java.util.Scanner;

public class ArrayLastElement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int size = scn.nextInt();//5
		int[] array = new int[size];//[5]

		for (int i = 0; i < array.length; i++) {

			array[i] = scn.nextInt();//values : 10,20,30,40,50
		}
		int lastElement = 0;
		
		// print last element only of an array

		for (int i = 0; i < size; i++) {//0<5
			if (i == size - 1) { 		//0==5-1--->0==4....4==4(true)
				lastElement = array[i]; 
			}
		}
		System.out.println(lastElement);

		scn.close();
	}

}
