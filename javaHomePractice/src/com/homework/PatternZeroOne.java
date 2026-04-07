package com.homework;

import java.util.Scanner;

/*Question-23) Zero-One Triangle Pattern

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1

*/

public class PatternZeroOne {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		for (int i = 1; i <= N; i++) { // on first iterations i=1;1<=5--->2;2<=5

			for (int j = 1; j <= i; j++) { // j=1;1<=1-->1;1<=2;--->1<=2,2<=2

				if ((i + j) % 2 == 0) {// 1+1=2--> print 1::::2+1=3--->print 0

					System.out.print("1 ");

				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();

		}
		scn.close();

	}

}
