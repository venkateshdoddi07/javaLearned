package com.codegnan.stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
				System.out.println("enter a string");
			String name=scn.next();
			String reverse="";
			for(int i=name.length()-1;i>=0;i--) {
				char currentChar=name.charAt(i);
				reverse+=currentChar;
			}
		System.out.println("Reverse of a string "+name + " is " + reverse);
		
		scn.close();
	}

}
