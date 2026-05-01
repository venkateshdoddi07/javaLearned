package com.codegnan.java8;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String>print=s->System.out.println(s);
		print.accept("hello world");
		
		Consumer<Integer> square=s1->System.out.println(s1*s1);
		square.accept(7);
		
		
		Consumer<Employee> display =e->System.out.println("Employee: "+e.getName()+"salary: "+e.getSalary());
		
		Employee e1=new Employee("ravi",50000);
		Employee e2=new Employee("varu",60000);
		display.accept(e1);
		display.accept(e2);
		
		
		
		
	}

}
