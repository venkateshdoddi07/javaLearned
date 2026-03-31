package com.codegnan;

import java.util.Scanner;

public class Array2DFromUser {

	public static void main(String[] args) {

		/*
		 * int [][] numbers= {{1,2,3},{5,30,6},{7,8}}; for(int i=0;i<numbers.length;i++)
		 * {
		 * 
		 * for(int j=0;j<numbers[i].length;j++) {
		 * 
		 * 
		 * 
		 * System.out.print(numbers[i][j]+" ");
		 * 
		 * } System.out.println(); }
		 * 
		 * //another easy method
		 * System.out.println("printing 2D array elements usuing enhanced for loop");
		 * for(int[] num:numbers) {
		 * 
		 * for(int x:num) {
		 * 
		 * System.out.print(x+" "); } System.out.println();
		 * 
		 * }
		 * 
		 * }
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = scn.nextInt();
		int[][] numbers = new int[rows][];

		for (int i = 0; i < rows; i++) {
			System.out.println("enter number of elements in row: " + i + " ");
			int cols = scn.nextInt();
			numbers[i] = new int[cols];
			System.out.println("enter elememts for row" + i + " ");
			for (int j = 0; i < cols; j++) {
				numbers[i][j] = scn.nextInt();
			}

			System.out.println("printing 2D array elements usuing enhanced for loop");
			for (int[] num : numbers) {

				for (int x : num) {

					System.out.print(x + " ");
				}
				System.out.println();

			}

		}scn.close();
	}
}
