package com.homework.grandtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class groupingWords{
	static void groupWord(ArrayList<String> list) {
		HashMap<Character,ArrayList<String>> map=new HashMap<>();
		for(String word:list) {
			char ch=word.charAt(0);
			if(!map.containsKey(ch)) {
				map.put(ch, new ArrayList<String>());
			}
			map.get(ch).add(word);
		}
		System.out.println(map);
	}
}

public class grouping {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		groupingWords gw=new groupingWords();
		while(true) {
			System.out.println("Enter words and type stop if u want to end");
			String word=scn.nextLine();
			if(word.equals("stop")) {
				break;
			}
			list.add(word);
			
		}
		gw.groupWord(list);

	}

}
