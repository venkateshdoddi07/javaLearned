package com.homework;

import java.util.Scanner;

public class PatternPracticeChristmasTree {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		int height=scn.nextInt();
		int width=scn.nextInt();
		int space=width*3;
		
		int x=1;
		
		for(int i=1;i<=height;i++) {              //overall height of the tree which is 5 layers
			
				for(int j=x;j<=width;j++) {  //for the first layer, creating 5 internal height(star) and width(space)
					
					for(int k=space;k>=j;k--) {// space 15 and then 15>=1 ,15--, it will give 15 space on first line
						System.out.print(" ");
					}
					
					for(int l=1;l<=j;l++) {// it will give 1 star like j value, after 15 spaces
						System.out.print("* ");
					}
					
					System.out.println();
					
				}
				x=x+i;
				width=width+2;
			
		
			
		}
		//creating trunk
		
		for(int a=1;a<=4;a++) {
		
			for(int b=1;b<=space-3;b++) {
				System.out.print(" ");
			}
			for(int c=1;c<=4;c++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
			
	}

}
