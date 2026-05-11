package com.homework.grandtest;
import java.util.Scanner;
class StringToInt{
	static void ParseNumber(String s) {
		try {
			double num=Double.parseDouble(s);
			System.out.println("parsed number: "+num);
			
		}catch(NumberFormatException e) {
			
			System.out.println("Invalid number format");
		}
	}
}

public class parseConversion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		String str=scn.nextLine();
		StringToInt result=new StringToInt();
		result.ParseNumber(str);

	}

}
