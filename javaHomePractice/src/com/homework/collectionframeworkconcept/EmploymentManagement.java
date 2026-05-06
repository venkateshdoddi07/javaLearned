package com.homework.collectionframeworkconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmploymentManagement {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		List<EmployeeArrayList>eal=new ArrayList<>();
		System.out.println("Enter size of an employees");
		int size=scn.nextInt();
		
		if(size<=0) {
			System.out.println("enter positive number");
			return;
		}
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.println("Enter employee id: ");
			int id=scn.nextInt();
			scn.nextLine();
			System.out.println("Enter employe name: ");
			String name=scn.nextLine();
			System.out.println("Enter employee salary: ");
			int salary=scn.nextInt();
			
			eal.add(new EmployeeArrayList(id,name,salary));
			
			
		}
		System.out.println();
		System.out.println("displaying all employees details: ");
		for(EmployeeArrayList e:eal) {
			System.out.println(e);
		}
		System.out.println();
		
		System.out.println("adding a new employee at specifix index");
		int index=scn.nextInt();
		scn.nextLine();
		String newName=scn.nextLine();
		int sal=scn.nextInt();
		eal.add(index,new EmployeeArrayList(index,newName,sal));
		System.out.println();
		
		System.out.println("removing an index using index: ");
		int index1=scn.nextInt();
		eal.remove(index1);
		
		System.out.println("displaying updated employees details after removing through index : ");
		for(EmployeeArrayList f:eal) {
			System.out.println(f);
		}
		
		System.out.println("search the existing employee is there or not");
		eal.contains(new EmployeeArrayList(2,"rambo",34)); 
		
		System.out.println("updating employee details using SET");
		int newIndex=scn.nextInt();
		eal.set(2, new EmployeeArrayList(newIndex,"rama",28));
		
		System.out.println("finding the index of a  employee using indexOf");
		System.out.println(eal.indexOf(3));
		
		System.out.println("using size()");
		System.out.println(eal.size());
		
		System.out.println("check list isEmpty or not");
		System.out.println(eal.isEmpty());
		
		System.out.println("creating a sublist of employees from index and index");
		List<EmployeeArrayList>sublist=eal.subList(1, 3);
		
		System.out.println("clear the entire list");
		eal.clear();
		
	}

}
