//package com.codegnan.java8;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class FilterExample {
//
//	public static void main(String[] args) {
////		List<Integer> numbers=new ArrayList<>();
////		for(int i=1;i<=10;i++) {
////			numbers.add(i);
////		}
////		
////		
////		//how to create a stream
////		Stream<Integer>stream=numbers.stream();
////		
////		Stream<Integer>evenNumbers=stream.filter(i->i%2==0);
////		//System.out.println(evenNumbers);
////		evenNumbers.forEach(System.out::println);
//		
//		
//		
//		List<Integer>numbers=Arrays.asList(20,15,17,3,84,45);
//		List<Integer>evenNumbers=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(evenNumbers);
//		
//		List<String>words=Arrays.asList("jack","mango","jacob");
//		
//		List<String>jNames=words.stream().filter(name->name.startsWith("j")).collect(Collectors.toList());
//		
//		System.out.println(jNames);
//		
//		
//		List<People> person=Arrays.asList(new People("malli",27),new People("malli",27),new People("malli",17),new People("malli",7));
//		
//		List<People>adult=person.stream().filter(p->p.age>=18).collect(Collectors.toList());
//		System.out.println(adult);
//		
//		
//		List<String>word=new ArrayList<>(List.of("Madam","racecar","hello","level"));
//		
//		List<String>palindrome=word.stream().filter(word->new StringBuilder(word).reverse().toString().equals(word)).collect(Collectors.toList());
//		System.out.println(palindrome);
//		
//		
//		
//	}
//
//}
