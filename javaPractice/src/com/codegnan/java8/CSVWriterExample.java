package com.codegnan.java8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVWriterExample {

	public static void main(String[] args) {
		List<Person> people=new ArrayList<>();
		people.add(new Person(111,"sunny","sunny@codegnan"));
		people.add(new Person(222,"venj","sven@codegnan"));
		people.add(new Person(333,"teddt","sucxy@codegnan"));
		try(PrintWriter pw=new PrintWriter("people.csv")){
			pw.print("id,name,email");
			pw.println();
			for(Person p:people) {
				pw.print(p.toCSV());
				pw.println();
			}
			System.out.println("Data has written to people.txt file");
		} catch (IOException e) {
						e.printStackTrace();
		}
	}

}
