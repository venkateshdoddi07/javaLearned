package com.codegnan;
import java.util.Scanner;


public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number to find its factorial");
		int N=scn.nextInt();
		int product=1;
		for(int i=1;i<=N;i++) {
			
			product=product*i;
			
		}
		System.out.println("Facorial of a number "+N+ " zis : "+product );
		
		
		scn.close();
		
	}

}
