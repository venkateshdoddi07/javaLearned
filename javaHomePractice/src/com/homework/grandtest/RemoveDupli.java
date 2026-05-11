package com.homework.grandtest;

import java.util.ArrayList;

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
		
	}

}
