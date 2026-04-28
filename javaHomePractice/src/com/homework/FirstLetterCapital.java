package com.homework;

import java.util.Scanner;

public class FirstLetterCapital {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String input=scn.nextLine();
		String[] words=input.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for(String word:words) {
			if(word.length()>0) {
				
				sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
			}
		}
		System.out.println(sb.toString());

	}

}
