package com.homework.grandtest;

import java.util.Scanner;

class DiamondPattern{
	static void pattern1(int n) {
		
		///upper part
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");	
			}
			
		//left star
			System.out.print("*");
			
		//middle spaces
			for(int k=1;k<=(2*i-3);k++) {
				System.out.print(" ");
			}
			//right star
			if(i!=1) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		//middle line
		for(int i=1;i<=(2*n-1);i++) {
			System.out.print("*");
		}
		System.out.println();
	
		//lower part
		
		for(int i=n-1;i>=1;i--) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			//left star
			System.out.print("*");
			
			//middle space
			for(int k=1;k<=(2*i-3);k++) {
				System.out.print(" ");
				
			}
			if(i!=1) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}

public class Pattern {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int n=scn.nextInt();
		DiamondPattern dp=new DiamondPattern();
		dp.pattern1(n);

	}

}
