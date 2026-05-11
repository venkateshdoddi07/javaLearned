package com.homework.grandtest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class CommonSkills {
	static Set<String> commonSkill(Set<String> s1, Set<String> s2) {

		Set<String> result = new HashSet<>();
		for (String skill : s1) {
			if (s2.contains(skill)) {
				result.add(skill);
			}
		}
		return result;

	}
}

public class usingSet {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		CommonSkills cs=new CommonSkills();
		Set<String> emp1=new HashSet<>();
		Set<String> emp2=new HashSet<>();
		
		System.out.println("Enter employee 1 skills and type stop to end ");
		while(true) {
			String s=scn.nextLine();
			s=s.toLowerCase();
			if(s.equals("stop")) {
				break;
			}
			emp1.add(s);
		}
		
		System.out.println("Enter employe 2 skills and type stop to end");
		while(true) {
			String s1=scn.nextLine();
			s1=s1.toLowerCase();
			if(s1.equals("stop")) {
				break;
			}
			emp2.add(s1);
		}
		
		Set<String> ans=cs.commonSkill(emp1, emp2);
		System.out.println(ans);
		
	}

}
