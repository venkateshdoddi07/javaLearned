package com.homework.grandtest;

import java.util.Scanner;

class calculate{
	static void calculateDays(int ab,int bc,int ac) {
		//formula
		//2(A+B+C)=(A+B)+(B+C)+(A+C)
		double total=(1.0/ab)+(1.0/bc)+(1.0/ac);
		double abc=total/2;
		double days=1/abc;
		System.out.println("All three can complete  work in "+ (int)days+" days");
		
		
	}
}

public class CalDays {
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		calculate c=new calculate();
		int ab=scn.nextInt();
		int bc=scn.nextInt();
		int ac=scn.nextInt();
		c.calculateDays(ab,bc,ac);
		
		
	}

}
