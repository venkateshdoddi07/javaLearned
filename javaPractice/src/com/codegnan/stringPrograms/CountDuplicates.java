package com.codegnan.stringPrograms;

import java.util.Scanner;

public class CountDuplicates {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String value");
		String name=scn.nextLine();
		
	
		for(int i=0;i<name.length();i++) {
			int count =0;
			char ch=name.charAt(i);
			boolean alreadyProcessed=false;
			
			//check for only already processed
			for(int j=0;j<i;j++) {
				
				if(ch==name.charAt(j)) {
					alreadyProcessed=true;
					break;
					
				}
			}
				if(alreadyProcessed) {
						continue;
				}
				
			
			for (int k = 0; k < name.length(); k++) {
				if (ch == name.charAt(k)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(ch +": "+count);
			}
			
			
		}
		
	
		
		
		
	}
	}


