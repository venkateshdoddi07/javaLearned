package com.codegnan.stringPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>();
		
		
		studentList.add(new Student(101,"malli",27));
		studentList.add(new Student(105,"arjun",37));
		studentList.add(new Student(110,"venk",24));
		studentList.add(new Student(102,"pras",27));
		
		
		studentList.add(0,new Student (111,"mahi",22));
		System.out.println(studentList);

	}}
//example with custom object ````````````````````````````````````` work  
