package com.codegnan.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingExample {

	public static void main(String[] args) {
			
		List<String> fruits=Arrays.asList("apple","orange","banana","grape","pear","kiwi");
		
		long count=fruits.stream().filter(s->s.length()==5).count();
		System.out.println(count);
		
		long count1=fruits.stream().count();
		System.out.println(count1);
		
		
		long count3=fruits.stream().filter(r->r.startsWith("a")).count();
		System.out.println(count3);
		
		List<People> person=Arrays.asList(new People("malli",27),new People("malli",27),new People("malli",17),new People("malli",7));
		long adultCount=person.stream().filter(p->p.age>=18).count();
		System.out.println(adultCount);
		
		
		
		
		
		//fruits in default sorting order
		
		List<String>asefruits=fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(asefruits);
		
		
		//fruits in custom sorting order
		
		
		List<String>descfruits=fruits.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.err.println(descfruits);
		
		
		List<People>ascorder=person.stream().sorted((p1,p2)->p1.name.compareTo(p2.name)).collect(Collectors.toList());
		System.out.println(ascorder);
		
		
		List<People>ageascorder=person.stream().sorted(Comparator.comparingInt(p->p.age)).collect(Collectors.toList());
		System.out.println(ageascorder);
		
		
	String min=fruits.stream().min((s1,s2)->s1.compareTo(s2)).get();
	System.out.println(min);
	String max=fruits.stream().max((s1,s2)->s1.compareTo(s2)).get();
	System.out.println(max);
	
	Optional<People>minage=person.stream().min(Comparator.comparingInt(p->p.age));
	minage.ifPresent(Person->System.out.println(minage));
		
		
		
		//for each
	
	List<Integer> numbers=Arrays.asList(10,20,30,40,50);
	numbers.stream().forEach(name->System.out.println(name));
	//difference
	
	List<Integer>num=numbers.stream().collect(Collectors.toList());
	System.out.println(num);
	
	
	//toArray
	Integer[] ir=numbers.stream().toArray(Integer[]::new);
	for(Integer i:ir) {
		System.out.println(i);
	}
	
	
	//stream.of()
	
	Stream<Integer>s=Stream.of(99,100,2123,212);
	System.out.println();
	s.forEach(System.out::println);
	}

}
