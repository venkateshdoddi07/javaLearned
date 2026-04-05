package com.homework;
import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
			int N=scn.nextInt(); //5
			
			//===================================================================
			
			for(int i=N;i>=1;i--) { //5,4,3,2,1 iterations
				
				int totalStar=i;
				int totalSpace=2*(N-i);
				
				//print star
				
				for(int star=1;star<=totalStar;star++) {//star count =i;
					System.out.print("* ");

				}
				
				//print space
				for(int space=1	;space<=totalSpace;space++) {
					System.out.print("  ");
				}
				
				//print star
				
				for(int star=1;star<=totalStar;star++) {//star count =i;
					System.out.print("* ");

				}
				
				System.out.println();
				
			}
			//===========================================================================
			
			//second part
			
			for(int i=1;i<=N;i++) {//i=1,2,3,4,5
				int totalStar=i;
				int totalSpace=2*(N-i);
				
				for(int star=1;star<=totalStar;star++) {
					System.out.print("* ");
				}
				
				for(int space=1;space<=totalSpace;space++) {
					System.out.print("  ");
				}
				for(int star=1;star<=totalStar;star++) {
					System.out.print("* ");
				}
				System.out.println();
				
			}
			
			
			
			


scn.close();
	}

}
