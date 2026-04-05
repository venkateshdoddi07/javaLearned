package com.homework;

/*
 Question20) Print the below pattern
 * * * *
   * * *
     * *
       *
*/
import java.util.Scanner;
public class PatternRightReverseTriangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<N;i++) {
			
			for(int j=N-i;j>=1;j--) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		
		for(int i=N;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
			
			
		}
	

	}}



