package com.codegnan;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethodDemo {

	public static void main(String[] args) {
		//generics to provide tyse safety and reslove typecasting problems
		
		Collection<String> fruits = new ArrayList<>();
		System.out.println("==========ad()========");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("kiwi");
		fruits.add("pineapple");

		System.out.println("fruits after add() method" + fruits);

		System.out.println("=============addAll()=========");
		Collection<String> moreFruits=new ArrayList<>();
		moreFruits.add("Mango");
		moreFruits.add("papaya");
		moreFruits.add("oranges");
		moreFruits.add("grapes");
		
		fruits.addAll(moreFruits);
		System.out.println("fruits after adding al;"+ fruits);
		
		
		
		System.out.println("==============remove()==========");
		fruits.remove("banana");
		System.out.println(fruits);
	}

}
