package com.codegnan;

import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {
Scanner scn= new Scanner (System.in);
	
int rows=scn.nextInt();
//first half

for(int i=1;i<=rows;i++) {
	
	for(int j=1;j<=rows-i;j++) {
		
		System.out.print("  ");
		
	}
	for(int k=1;k<=2*i-1;k++) {
		System.out.print("* ");
	}
	System.out.println();
}


//second half

for(int i=rows-1;i>=1;i--) {
	
	for(int j=1;j<=rows-i;j++) {
		System.out.print("  ");
		
	}
	for(int k=1;k<=2*i-1;k++) {
		
		System.out.print("* ");
	}
	System.out.println();
}





scn.close();
	}

}
