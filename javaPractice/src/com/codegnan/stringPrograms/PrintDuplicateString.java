package com.codegnan.stringPrograms;

import java.util.Scanner;

public class PrintDuplicateString {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in) ;
		String str=scn.nextLine(); //
		String storeDuplicate="";
		
		
		for(int i=0;i<str.length();i++) { //0<4
			char ch=str.charAt(i); 
			for(int j=i+1;j<str.length();j++) { //0<0
		
			
			if(ch==str.charAt(j)) { //v==
				if(!storeDuplicate.contains(str.charAt(i) + "")) {
					storeDuplicate += ch;
				}
				break;
			}
			}
			
			
		}
		System.out.println(storeDuplicate);
		
		
		
		
		
		scn.close();
	}

}
