package com.homework.grandtest;

import java.util.Scanner;

class Cwords{
	static void countWord(String s) {
		s=s.trim();
		String  array[]=s.split("\\s+");
		System.out.println("Words :"+array.length);
		
	}
}

public class CountWords {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String name=scn.nextLine();
		Cwords c=new Cwords();
		c.countWord(name);
		
		
	}

}
