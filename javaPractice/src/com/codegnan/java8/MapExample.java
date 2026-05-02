package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,10,-29,34);
		List<Integer>tnumbers=numbers.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println(tnumbers);
		
		List<String>words=Arrays.asList("apple","banana","kiwi","mango");
		List<String>ufruits=words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(ufruits);
		
		
		
		
		
	}

}
