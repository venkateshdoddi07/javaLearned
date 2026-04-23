package com.homework;

import java.util.Scanner;

public class StringCheckPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String str=scn.nextLine();
		String rev="";
		
		//check palindrome
		
		/*for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)) {
			System.out.println("it is palindrome");
		}else{
			System.out.println("it is not  a palindrome");
		}
		*/
		
		//counts vowels and consonants
		
		int vowels=0;
		int consonants=0;
		
		for(char c:str.toLowerCase().toCharArray()) {
			if(c>='a' && c<='z') {
				if("aeiou".indexOf(c) !=-1) {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);

		
		
		
		
		
		
		
		scn.close();

	}

}
