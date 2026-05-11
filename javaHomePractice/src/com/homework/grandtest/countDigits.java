package com.homework.grandtest;

import java.util.Scanner;

class Cdigits{
	static void count(String s) {
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			
			if(ch>='0' && ch<='9') {
				count ++;
				System.out.print(ch+" ");
			}
		}
		System.out.println();
		System.out.println("count: "+ count);
		
	}
}

public class countDigits {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		String name=scn.nextLine();
		Cdigits cd=new Cdigits();
		cd.count(name);

	}

}
