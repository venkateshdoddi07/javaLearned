package com.codegnan.stringPrograms;

import java.util.Scanner;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String  name=scn.next();
		
		String result="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			boolean found=false;
			
			for(int j=0;i<result.length();j++) {
				if(ch==result.charAt(j)) {
					found=true;
					break;
				}
			}
			if(!found) {
				result=result+ch;
			}
		}
		
		
		
		scn.close();
	}

}
