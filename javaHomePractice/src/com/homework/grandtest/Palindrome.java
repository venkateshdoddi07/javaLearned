package com.homework.grandtest;

import java.util.Scanner;

class checkPalindrome{
	static void checPalindrome(String s) {
		s=s.toLowerCase();
		String result="";
		for(int i=s.length()-1;i>=0;i--) {
			result=result+s.charAt(i);
			
		}
		if(result.equals(s)) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
	}
}


public class Palindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String name=scn.nextLine();
		checkPalindrome cp=new checkPalindrome();
		cp.checPalindrome(name);

	}

}
