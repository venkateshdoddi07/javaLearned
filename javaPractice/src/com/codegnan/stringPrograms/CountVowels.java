package com.codegnan.stringPrograms;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		String name=scn.nextLine();
		int vowels=0;
		int consonents=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			ch = Character.toLowerCase(ch);
			
			if(ch=='a' || ch =='e' ||ch =='i' ||ch=='o' || ch=='u') {
				vowels++;
			}else {
				consonents++;
			}
			
			
			
		}
		System.out.println("vowels : " +vowels);
		System.out.println("consonents :"+consonents);
		
	}

}
