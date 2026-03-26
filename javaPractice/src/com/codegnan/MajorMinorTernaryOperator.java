//ternary concept 2
package com.codegnan;

import java.util.Scanner;
public class MajorMinorTernaryOperator{
public static void main(String[] args){

Scanner scanner=new Scanner(System.in);

int age=scanner.nextInt();

String result=(age>=18)?"major":"minor";

System.out.println("you are : " +result );
}
}
