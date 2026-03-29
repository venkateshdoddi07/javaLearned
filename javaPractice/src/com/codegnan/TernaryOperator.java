//nested ternary concept
//even odd concept
package com.codegnan;

import java.util.Scanner;
public class TernaryOperator{
public static void main (String[] args){

//object creation syntax
//classname objectname =new classname();
Scanner scanner =new Scanner(System.in);
System.out.println("Enter a number");
int number=scanner.nextInt();

String result=(number%2==0)?"even":"odd";

System.out.println("the result is " +result);
}
}