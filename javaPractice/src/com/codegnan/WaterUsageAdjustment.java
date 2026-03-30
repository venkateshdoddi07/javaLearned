package com.codegnan;

import java.util.Scanner;

public class WaterUsageAdjustment {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// step1: read the number of stations N and queries Q
		int NS = scn.nextInt(); // number of stations
		int NQ = scn.nextInt(); // number of queries

		int[] waterUsage = new int[NS];
		for (int i = 0; i < NS; i++) {

			waterUsage[i] = scn.nextInt();
		}
		for (int i = 0; i < NQ; i++) {
			int startPoint = scn.nextInt();
			int endPoint = scn.nextInt();
			int adjustment = scn.nextInt();

			// apply adjustment to all station in the range [L,R]
			for (int j = startPoint - 1; j < endPoint; j++) {
				waterUsage[j] += adjustment;

				// ensure the usage does not goes below zero
				if (waterUsage[j] < 0) {
					waterUsage[j] = 0;
				}
			}

		}
		// display the final water usage for all station
		for (int i = 0; i < NS; i++) {

			System.out.print(waterUsage[i]);

			if (i < NS - 1) {
				System.out.println(" ");

			}
		}

		scn.close();
	}

}
