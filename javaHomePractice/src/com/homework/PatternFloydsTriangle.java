package com.homework;
/* Question-29) Floyd's Triangle (Letters)
A
BC
DEF
GHIJ
KLMNO
*/
import java.util.Scanner;
public class PatternFloydsTriangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int N=scn.nextInt();
		char result=65;
		for(int i=1;i<=N;i++) {
			
			for(int j=1;j<=i;j++) {
				
				
				System.out.print(result);
				result++;
			}
			System.out.println();
			
			
			
		}
		
		
		scn.close();
	}

}
