package com.homework.grandtest;

import java.util.Scanner;

class Vowels {

	static void count(String s) {
		int vowels = 0;
		int consonants = 0;
		// converting string to lower case

		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonants: "+consonants);

	}
}

//String based

public class StringBased {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name=scn.nextLine();
		Vowels v=new Vowels();
		v.count(name);
		

	}

}
