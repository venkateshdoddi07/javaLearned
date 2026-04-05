package com.homework;

/*Question-21) Print squareHollowPattern

* * * * * *
*         *
*         *
*         *
*         *
* * * * * *

*/
import java.util.Scanner;

public class PatternSqaureHallow {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();// 1,2,3,4,5,6
		
		for (int i = 1; i <= N; i++) {// 1st iteration

			for (int j = 1; j <= N; j++) { // 6 times star
				if(i==1 || i==N || j==1 ||j==N) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
					
			}
				System.out.println();
		scn.close();
	}

}
}
