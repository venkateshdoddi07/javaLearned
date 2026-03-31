package com.codegnan;

import java.util.Scanner;

public class fibbonaciSeries {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of terms");
		int numberOfTerms = scn.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("fibbanoci series");
		System.out.print(firstTerm + " " + secondTerm + " ");

		for (int i = 2; i < numberOfTerms; i++) {

			int nextTerm = firstTerm + secondTerm;
			System.out.print(nextTerm + " ");
			firstTerm = secondTerm;
			secondTerm = nextTerm;

		}
		scn.close();

	}

}
