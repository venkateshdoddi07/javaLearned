package com.codegnan;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// armStrong number is equal to the sum of the digits, where each digit is a
		// power of its total digits

		System.out.println("Enter the digit");

		int number = scn.nextInt();// 153
		int originalNumber = number;

		int count = 0;
		while (number != 0) {

			number = number / 10;// 12-->1--->0
			count++;

		}
		System.out.println("the count of the given number digits are " + originalNumber + " is " + count);

		number = originalNumber;
		int temp = number;
		double sum = 0;
		while (temp != 0) {
			int digit = temp % 10;//3
			sum = sum + Math.pow(digit, count);//0+(3^3)=9;
			temp /= 10;//12

		}
		if (sum == originalNumber) {
			System.out.println(" the number is armStrong");
		} else {
			System.out.println(" the number is not an armStrong");
		}
		scn.close();
	}

}
