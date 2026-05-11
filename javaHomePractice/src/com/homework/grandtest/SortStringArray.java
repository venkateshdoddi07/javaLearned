package com.homework.grandtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SortString{
	static void SortArray(ArrayList<String> list) {
		Collections.sort(list);
		System.out.println(list);
		
	}
}

public class SortStringArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		SortString ss=new SortString();
		ArrayList<String> list=new ArrayList<>();
		
		while(scn.hasNext()) {
			String s=scn.next();
			
			if(!s.matches("[a-zA-Z]+")) {
				break;
				
			}
			list.add(s);
		}
		ss.SortArray(list);

	}

}
