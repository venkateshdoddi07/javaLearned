package com.homework;
/*Question-30) Number Triangle Pattern
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 

*/
import java.util.Scanner;
public class PatternNumberPyramid {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
			int N=scn.nextInt();
			int initial=1;
			for(int i=1;i<=N;i++) {
				
				for(int j=N-i;j>=1;j--) {
					
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print(initial+" ");
				}
				initial++;
				
				
				
				
				System.out.println();
				
			}
		
		
scn.close();
	}

}
