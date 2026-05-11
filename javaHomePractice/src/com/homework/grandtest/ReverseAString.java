package com.homework.grandtest;

import java.util.Scanner;

class Reverse{
	static void rev(String s) {//java
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.print(s.charAt(i));
		}
		
	}
}


public class ReverseAString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String name=scn.nextLine();
		Reverse r=new Reverse();
		r.rev(name);

	}

}
