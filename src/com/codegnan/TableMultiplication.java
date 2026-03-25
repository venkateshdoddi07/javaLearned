package com.codegnan;
import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter table name");
		int table=scanner.nextInt();
		
		for(int i=1;i<=20;i++) {
		
			System.out.println(table + "*" + i +"=" + (table*i));
		}
		
		
		scanner.close();
		
	}

}
