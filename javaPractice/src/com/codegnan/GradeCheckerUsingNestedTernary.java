package com.codegnan;
import java.util.Scanner;
public class GradeCheckerUsingNestedTernary{
			public static void main(String[] args){
				Scanner scanner=new Scanner(System.in);
		//take input from 1 to 100 only;

	System.out.println("Enter the marks between 0 to 100");
	int marks=scanner.nextInt();
	if(marks>=100){
System.out.println("marks should be more than 0 and less than 100");
return; // this plays a major role to break the execution
}

	char grade=(marks>=90)?'A':
								(marks>=80)?'B':
											(marks>=70)?'C':
													(marks>=60)?'D':
														(marks>=50)?'E':'F';
String description= (marks>=90)?"Excellent":
											(marks>=80)?"very good":
												(marks>=70)?"good":
														(marks>=60)?"satisfactory":
															(marks>=50)?"pass":"fail";

System.out.println("the grade is : " +grade);
System.out.println("the description is : " +description);

}
}