package com.homework;
/*
 Question-1) 
create a Java program using a class called Student with the following specifications:

Class Requirements:
Instance Variables:

String name

int rollNumber

int[] marks (for 3 subjects)

Constructors:

Default Constructor:

Set name to "Unknown"

Roll number to 0

Marks to {0, 0, 0}

Parameterized Constructor:

Accept name, roll number, and marks for 3 subjects

Instance Methods:
void displayDetails()
→ Print name, roll number, and all marks

int calculateTotal()
→ Return the total of all 3 marks

double calculateAverage()
→ Return the average of the marks

 In the main() method (inside another class named StudentDemo), do the following:
Create one object using the default constructor

Create another object using the parameterized constructor

Call displayDetails(), calculateTotal(), and calculateAverage() for both objects complete this task based on the fallowing conditions
 */

public class StudentClass {
	String name;
	int rollNumber;
	int[] marks;
	
	public StudentClass() {
		this.name="unknown";
		this.rollNumber=0;
		this.marks= new int[] {0,0,0};
		
	}
	
	public StudentClass(String name,int rollNumber,int[] marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
		for(int i=0;i<marks.length;i++) {
			this.marks[i]=marks[i];
		}
		
	
	}
	void displayDetails() {
		System.out.println(name);
		System.out.println(rollNumber);

		for(int i=0;i<marks.length;i++) {
			System.out.print(" "+marks[i]+" ");
		}
		
	}
	public int CalculateTotal() {
		int total=0;
		for(int i=0;i<marks.length;i++) {
			total+=marks[i];
		}
		return total;
	}
	
	public double CalculateAverage() {
		double average=CalculateTotal()/3.0;
		return average;
	}
	
	
	}

