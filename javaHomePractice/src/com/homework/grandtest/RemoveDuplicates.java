package com.homework.grandtest;

import java.util.Scanner;



class Rduplicate{
	static void RdDuplicate(String s) {
		
		s=s.toLowerCase();
		String result="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(result.indexOf(ch)==-1) {
				result=result+ch;
			}
		}
		System.out.println(result);
		
	}
	
}

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String name=scn.nextLine();
		Rduplicate rd=new Rduplicate();
		rd.RdDuplicate(name);
				
		
	}

}
