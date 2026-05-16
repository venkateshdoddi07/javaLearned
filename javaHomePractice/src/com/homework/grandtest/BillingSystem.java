package com.homework.grandtest;

import java.util.Scanner;
class Billing{
	static void totalBilling(int array[]) {
		int max=array[0];
		int min=array[0];
		int total=0;
		System.out.println("purchased item prices");
		
		for(int price:array) {
			System.out.println(price);
			total=total+price;
			
			if(price>max) {
				max=price;
			}
			if(price<min) {
				min=price;
			}
		}
		
		
		double discount=0;
		if(total>5000) {
			discount=total*0.10;
		}
		
		double finalAmount=total-discount;
		System.out.println("\n most Expensive item = "+max);
		System.out.println(" chepeast item = "+min);
		System.out.println(" total bill is = "+total);

		System.out.println(" discount applied = "+discount);
		System.out.println(" final amount  = "+finalAmount);


		
	}
}

public class BillingSystem {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		Billing b=new Billing();
		int n=scn.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scn.nextInt();
		}
		b.totalBilling(array);
	}

}
