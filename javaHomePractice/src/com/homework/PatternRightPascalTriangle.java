package com.homework;

/*Question-24) Right Pascal’s Triangle
Forms a right-angled triangle pointing upward and downward, creating a right Pascal’s triangle shape.


*
* *
* * *
* * * *
* * *
* *
*

*/
import java.util.Scanner;

public class PatternRightPascalTriangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		
		//first half
		for(int i=1;i<=N;i++) {
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			
			for(int j=N-i;j>=N;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	//second half
		
		for(int i=N-1;i>=1;i--) {
			

			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		
		
		
		
scn.close();
	}

}
