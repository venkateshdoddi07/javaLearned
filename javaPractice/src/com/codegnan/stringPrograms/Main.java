package com.codegnan.stringPrograms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		String password=scn.nextLine();
		PasswordChecker pc=new SimplePasswordChecker();
		
		
		
		
		System.out.println(pc.checklength(password));
		System.out.println(pc.checkComplexity(password));
		
		
	}

}
