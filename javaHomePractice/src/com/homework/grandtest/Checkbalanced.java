package com.homework.grandtest;

import java.util.Scanner;

class checBalanced{
	static boolean checkBalanced(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(ch=='(') {
				count++;
			}else {
				if(ch==')') {
					count--;
				}
				
				if(count<0) {
					return false;
				}
			}
			
		}
		return count==0;
	}
}


public class Checkbalanced {
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String name=scn.nextLine();
		checBalanced cb=new checBalanced();
		boolean result=cb.checkBalanced(name);
		if(result) {
			System.out.println("Message Verified");
		}else {
			System.out.println("Invalid Message");
		}

	}

}
