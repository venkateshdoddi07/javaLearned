package com.homework;

import java.util.Scanner;

/*
 Question22 print below numeric Pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
  
  */
public class PatternNumbersTriangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int num=1;
		for(int i=1;i<=N;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(num+ " ");
				num++;
				
			}
			System.out.println();
		}
		
		
		
		scn.close();
	}

}
