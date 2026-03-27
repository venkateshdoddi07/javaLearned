package com.homework;

/*
 * 
Q9) Hour of the Day Greeting
Problem:
 Write a Java program to print a greeting based on the hour of the day using ternary operators:

"Good Morning" if the hour is between 5 AM and 12 PM
"Good Afternoon" if the hour is between 12 PM and 5 PM
"Good Evening" if the hour is between 5 PM and 10 PM
"Good Night" if the hour is between 10 PM and 5 AM
 * 
 * */
import java.util.Scanner;

public class DayGreeting {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
//		System.out.println("Enter hours from 00 to 24");
//		int hour=scanner.nextInt();
//		String result=(hour>=5 && hour<=12)? "Good Morning":
//						(hour>12 && hour<=17)? "Good Afternoon":(
//								hour>17 && hour<=22)?"Good Evening":(
//										hour>22 && hour<=24 || hour>=0 && hour<5)?"Good Night":"Enter digits from 1 to 24 only";	
//		System.out.println(result);
//		
		
		
		System.out.println("Enter the 12hrs time format");
		int hours=scanner.nextInt();
		String period=scanner.next();	
		
		String results=(hours>=5 && hours<12 && period.equals("AM"))? "Good Morning":
			(hours>=12 || hours>=1 && hours<=5 && period.equals("PM"))? "Good Afternoon":(
					hours>5 && hours<=10 && period.equals("PM"))?"Good Evening":(
							hours>10 && hours<00 && period.equals("PM")|| hours>=00 && hours<5 && period.equals("AM"))?"Good Night":"Enter digits from 1 to 12 only and AM/PM";	
System.out.println(results);
		
		
scanner.close();
	}

}
