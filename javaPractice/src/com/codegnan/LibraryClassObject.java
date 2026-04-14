package com.codegnan;

import java.util.Scanner;

public class LibraryClassObject {
	
	int days;
	int fine;
	
	public LibraryClassObject(int days,int fine) {
		
		if(fine<0 || days<0) {
			System.out.println("invalid fine input choose positive number");
		}else {
		
		this.days=days;
		this.fine=fine;
		double total=days*fine;
		System.out.println(total);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int days=scn.nextInt();
		int fine=scn.nextInt();
		LibraryClassObject l1=new LibraryClassObject(days,fine);
		
		
		scn.close();
		
	}

}
