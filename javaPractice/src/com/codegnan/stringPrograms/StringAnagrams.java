package com.codegnan.stringPrograms;

import java.util.Scanner;

public class StringAnagrams {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter string 1");

		String s1 = scn.next();

		System.out.println("enter string 2");
		
		String s2 = scn.next();
		//check two string lengths are equals
		//if length are not equals they cannot be anagrams
		
		if(s1.length()!=s2.length()) {
			System.out.println("not a Anagram");
			return;
			
		}
		
		//assume strings are anagrams
		boolean isAnagram=true;
		
		
		//traverse each character of a first string
		for(int i=0;i<s1.length();i++){
			char ch1=s1.charAt(i);
			
			int count1=0;
			int count2=0;
		//count occurences of ch1 in s1
			
			for(int j=0;j<s1.length();j++) {
				if(ch1==s1.charAt(j)) {
					count1++;
					
				}
			}
			for(int k=0;k<s2.length();k++) {
				if(ch1==s2.charAt(k)) {
					
					count2++;
					
				}
			}
			if(count1!=count2) {
				isAnagram=false;
				break;
			}
			
		}
		if(isAnagram) {
			System.out.println("Anagrams");
		}else {
			System.out.println("not Anagram");
		}
		
		
		//scn.close();
	}

}
