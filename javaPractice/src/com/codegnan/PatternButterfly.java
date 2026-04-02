package com.codegnan;

import java.util.Scanner;

public class PatternButterfly {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int rows=scn.nextInt();

//part-1 upper part (expanding upper wings

for(int i =1;i<=rows;i++) {
		//inner loop for A: print starts for left wing
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	
	//inner loop b printspaces in the middle gap
	//the number of spaces decereses as I decreases
	//formula 2*(rows-i)
	
	// take formula by declaring a variable (spaces)
	int spaces=2*(rows-i);
	for(int j=1;j<=spaces;j++) {
		System.out.print(" ");
	}
	
	//print * where, from 1 to i(1,2,3,4,5)
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		
	}
	//move to the next line
	System.out.println();
	
	
}


//part-2  lower part


for(int i=rows-1;i>=1;i--) {
	
	//inner for loop print stars for left wing
	//print star from 1 to  (row-1)
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	
	// take variable spaces with the formula
	int spaces=2*(rows-i);
	// 
	for(int j=1;j<=spaces;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	
	System.out.println();
	
}



	}

}
