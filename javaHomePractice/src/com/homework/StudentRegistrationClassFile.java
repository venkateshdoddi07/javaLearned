package com.homework;
/*Question 2): Greenwood High Registration
Question:
 At Greenwood High School, the administration is launching an online portal to manage student registrations.
 Each student has a name, roll number, and grade level (1 to 12).
 The system must ensure that the name is not empty, the roll number is positive, and the grade level is valid.
 If any input is invalid, the constructor should throw an exception.
 Create a method showProfile to display the student’s details.

Testcase-1
Input:
Alice Brown
101
10

Output:
Name: Alice Brown, Roll Number: 101, Grade: 10

Testcase-2
Input:
Ravi Kumar
0
9

Output:
Error: Roll number must be positive

Testcase-3
Input:
Clara Davis
103
13

Output:
Error: Grade level must be between 1 and 12

Testcase-4
Input:
David Lee
104
8

Output:
Name: David Lee, Roll Number: 104, Grade: 8
-----------------------------------------------------------------------------------------------------------------------*/
public class StudentRegistrationClassFile {
	//Each student has a name, roll number, and grade level (1 to 12).
	
	String name;
	int rollNumber;
	int grade;
	boolean isValid=true;
	public StudentRegistrationClassFile(String name, int rollNumber, int grade) {

	    if (name == null || name.equals("")) {
	      System.out.println("Name cannot be empty");
	      isValid=false;
	      return;
	    }

	    if (rollNumber < 1) {
	    	System.out.println("Error: Roll number must be positive");
	    	isValid=false;
	    	return;
	    }

	    if (grade < 1 || grade > 12) {
	    	System.out.println("Error: Grade level must be between 1 and 12");
	    	isValid=false;
	    	return;
	    }

	    this.name = name;
	    this.rollNumber = rollNumber;
	    this.grade = grade;
	}
	
	public void showProfile() {
		if (!isValid) {
            return;  // don't print anything if invalid
        }
		System.out.println("student name is : "+this.name);
		System.out.println("student rollNumber is: "+this.rollNumber);
		System.out.println("student grade is : "+this.grade);
		
	}

}
