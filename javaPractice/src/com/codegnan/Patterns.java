//package com.codegnan;
//
//import java.util.Scanner;
//
//public class Patterns {
//
//	public static void main(String[] args) {
//		
//		Scanner scn=new Scanner(System.in);
//		
//		int rows=scn.nextInt();
//		int cols=scn.nextInt();
//		//for printing * into (R X C)
////		
////		for(int i=0;i<rows;i++) {
////			
////			for(int j=0;j<cols;j++) {
////				
////				System.out.print("* ");
////			}
////			
////		}
//		
//		//inverted pyramid pattern left
//		//outer for loop starts each row
//		
////		for(int i=0;i<rows;i++) {
////			//inner loop to print *
////			for(int j=0;j<rows-i;j++ ) {
////				
////				System.out.print( (5-i)+" ");
////			}
////			System.out.println();
////		}
//		//another pattern
////		for(int i=0;i<rows;i++) {
////			//inner lopp to print spaces before star
////			
////			for(int j=0;j<i;j++) {
////				
////				System.out.print("  ");
////			}
////			for(int k=0;k<rows-i;k++) {
////				
////				System.out.print("* ");
////				
////			}System.out.println();
////			
////		}
//		//pyramid pattern
//		for(int i=1;i<=rows;i++) {
//			//inner lopp to print  leading spaces and alognment
//			//thee number of spaces 
//			
//			
//			for(int j=1;j<=rows-i;j++) {
//				
//				System.out.print("  ");
//			}
//			
//			//print the starts for current row
//			for(int k=1;k<=2*i-1;k++) {
//				
//				System.out.print("* ");
//				
//			}System.out.println();
//		
//	}
//		for(int i=rows;i>=rows;i--) {
//			
//				for(int j=1;j<=rows-a;++) {
//					System.out.print("  ");
//				}
//
//				for(int c=1;c<=2*a-1;c++) {
//					System.out.print("* ");
//				}
//			
//			System.out.println();
//		}
//		
//	}
//}
