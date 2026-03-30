package com.homework;
/*Question 14: Difference between max and min
 Problem Statement
Write a program to calculate and print the difference between the maximum and minimum elements in an array.
Sample Test Cases
Test Case 1
Input:
4
5
2
8
1
Output:
7
Explanation: max = 8, min = 1, difference = 8 - 1 = 7*/

import java.util.Scanner;

public class ArrayMaxMinDiff {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int size = scn.nextInt(); // 4
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt(); // 5,2,8,1
		}

		int max = 0;
		int min = 0;

		for (int i = 0; i < array.length; i++) {// 5<4, 2<4

			if (i == 0) { // 0==0 2==0,
				min = array[i]; // min=5;
			}

			if (array[i] > max) {// 5>0,false,8>5

				max = array[i];// 5,8
			}
			if (array[i] < min) {// 5<0 (false),2<0
				min=array[i];
			}

		}
		System.out.println("the difference between " + max + " and " + min + " is " + (max - min));

	}

}
