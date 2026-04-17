package com.codegnan.stringPrograms;

import java.util.Scanner;



public class CheckPalindromeString {
	
	public static boolean isPalindrome(String name ) {
		name=name.toLowerCase();
		int left = 0;
		int right=name.length()-1;
		while(left<right) {
			if (name.charAt(left) != name.charAt(right)) {
				return false;
				
			}
			left++;
			right--;
		}

		return true;
		
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	System.out.println("Enter a string");
	String name=scn.next();
	
	System.out.println("the entered string  is "+ isPalindrome(name));

	
	
	
	
	}
	
	
}
