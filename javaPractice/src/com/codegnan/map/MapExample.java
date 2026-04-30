package com.codegnan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

		//using all the methods of the map();
	
	public static void main(String[] args) {
		
			Map<String,Integer> studentMarks=new HashMap<>();
			
		studentMarks.put("arjun",89);
		studentMarks.put("malli",98);

		studentMarks.put("venky",78);

			
		System.out.println(studentMarks);
		
		System.out.println("=====putAll()=====");
		
		Map<String,Integer> newStudents=new HashMap<>();
		newStudents.put("ananya",67);
		newStudents.put("ven", 35);
		studentMarks.putAll(newStudents);
		System.out.println(studentMarks);
		
		
		System.out.println("Marks of arjun: "+studentMarks.get("arjun"));
		System.out.println("removed ven marks: "+studentMarks.remove("ven"));
		System.out.println("is malli present: "+studentMarks.containsKey("malli"));
		System.out.println("is any student scored 100: "+studentMarks.containsValue(100));
		System.out.println("is map is empty: "+studentMarks.isEmpty());
		System.out.println("studnet size : "+studentMarks.size());
		Set<String>studentNames=studentMarks.keySet();
		System.out.println("all student names"+ studentNames);
		Collection<Integer> marks=studentMarks.values();
		System.out.println("marks: "+marks);
		Set<Map.Entry<String, Integer>> entries=studentMarks.entrySet();
		System.out.println("all entries are : ");
		for(Map.Entry<String, Integer>entry:entries) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
			
		}
		studentMarks.clear();
		System.out.println("map cleared is empty? "+ studentMarks.isEmpty());
		
		
		
		
	}
	
}
