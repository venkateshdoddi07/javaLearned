package com.codegnan;

import java.util.Scanner;

public class ElectricityBillCalculator {

	private static final double RATE_SLAB_1 = 2.00; // 1-100 UNITS
	private static final double RATE_SLAB_2 = 3.50; // 101-200 UNITS
	private static final double RATE_SLAB_3 = 5.00; // 201-300 UNITS
	private static final double RATE_SLAB_4 = 7.00; // AVOVE 100 UNITS
	private static final double FIXED_CHARGE = 50.00;
	private static final double SURCHARGE_PCT = 0.02;
	private static final double SURCHARGE_THRESHOLD = 500.00;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("        Electricity bill Calculator      ");
		System.out.println("=======================================");
		System.out.println();
		System.out.println("Enter Consumer Name");
		String name=scanner.nextLine();
		System.out.println("Enter Consumer Number");
		String consumerNumber=scanner.nextLine();
		System.out.println("Enter units consumed");
		int units=scanner.nextInt();
		System.out.println();

	}

}
