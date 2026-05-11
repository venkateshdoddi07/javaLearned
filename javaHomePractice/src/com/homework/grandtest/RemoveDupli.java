package com.homework.grandtest;

import java.util.ArrayList;
import java.util.Scanner;

class deleteDuplicate{
	
	static void delRepeated(ArrayList<Integer> list) {
		
		ArrayList<Integer> unique=new ArrayList<>();
		for(int num:list) {
			if(!unique.contains(num)) {
				unique.add(num);
			}
		}
		System.out.println();
		System.out.println(list);
		System.out.println();
		System.out.println(unique);
	
		
	}
}

public class RemoveDupli {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		deleteDuplicate d=new deleteDuplicate();
		
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("enter number and a letter to stop");
		while(scn.hasNextInt()) {
			int i=scn.nextInt();
			list.add(i);
			
		}
		
		d.delRepeated(list);
	}

}
