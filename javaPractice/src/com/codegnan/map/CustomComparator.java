package com.codegnan.map;

import java.util.Comparator;

import com.codegnan.stringPrograms.Student;

public class CustomComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
				return -o1.name.compareTo(o2.name);
	}

	

//	@Override
//	public int compare(Object o1, Object o2) {
//		String s1=o1.toString();
//		String s2=o2.toString();
//				return -s1.compareTo(s2);
//	}
//	
	
	

}
