package com.codegnan.stringPrograms;

import java.util.Scanner;

public class CheckVowelsAndConsonents {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	
				String name = scn.nextLine();
				
				String vowels = "";
				String consonants = "";
				
				for (int i=0;i< name.length();i++) {
					char ch = Character.toLowerCase(name.charAt(i));
					
					
					if (ch>='a' && ch<='z') {
						
						if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
							vowels+= ch;
						} else {
							consonants+=ch;
						}
						
					}
				}
				
				System.out.println("Vowels: " + vowels);
				System.out.println("Consonants: " + consonants);
				
				scn.close();
			}
		

}
