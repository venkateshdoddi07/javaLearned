


/*Q6)  Write a Java program that categorizes a person into an age group based on their age using a ternary operator:
"Child" if age is less than 12*/
package com.homework;
import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter age of a person");
		int age=scn.nextInt();
		String result=(age<12&&age>0)?"he is  a child":
			(age>12 && age<=18)?"he is a teenager":
				(age>18 && age<60)?"he is an adult":
					(age>60 && age<=150)?"he is an elderly person":"enter age greater then 0 and less then 150";
		System.out.println(result);
	}

}
