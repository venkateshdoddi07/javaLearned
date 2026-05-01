package com.codegnan.java8;
import java.util.function.Function;
public class Predicate {

	public static void main(String[] args) {
Predicate<Integer> p=i->i>10;


System.out.println(p.test());


Predicate<Integer> p2=i->i%2==0;
System.out.println(p2.test(5));

	}

}
