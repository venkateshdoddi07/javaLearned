package com.homework.collectionframeworkconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListConcept {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		List<Student> l1 = new ArrayList<>();
		
		System.out.println("Enter number of student data list");
		int n=scn.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter student details");
			System.out.println("Enter id: ");
				int id=scn.nextInt();
				scn.nextLine();
			System.out.println("Enter name: ");
				String name=scn.nextLine();
			System.out.println("Enter age: ");
				int age=scn.nextInt();
				
				
				l1.add(new Student(id,name,age));

			
		}
		//display student
		for(Student display:l1) {
			System.out.println(display);	
		}
		
		//check size
		System.out.println(l1.size());
		//check is empty
		System.out.println(l1.isEmpty());
		//print index value
		System.out.println("Enter index value: ");
		int index=scn.nextInt();
		if(index>=0 && index<l1.size()) {
		System.out.println(" the selectec index value is :" +l1.get(index));
		
		}else {
			System.out.println("invalid index");
		}
		
		
	}

}
