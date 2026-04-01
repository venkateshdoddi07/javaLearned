package com.codegnan;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int rows=scn.nextInt();
		

//square hallow pattern
		for(int i =0;i<rows;i++) {
				for(int j=0;j<rows;j++) {
					if(i==0 ||j==0|| i==rows-1||j==rows-1) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			
			
			System.out.println();
			
		}
	}

}
