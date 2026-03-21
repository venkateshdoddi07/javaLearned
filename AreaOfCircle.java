//Write a Java program to input the radius of a circle and calculate its area using the formula:Area = π × r²
//Display the result as a floating-point number with two decimal places.

import java.util.Scanner;
public class AreaOfCircle{
public static void main(String[] args){

Scanner scanner=new Scanner(System.in);
System.out.println("Enter Radius of circle");
double radius=scanner.nextDouble();
double AreaOfCircle =(Math.PI*radius*radius);
System.out.println("the result is in floating point with two decimals : " + AreaOfCircle);

//System.out.println("the result is in two decimals : " + String.format("%.2f"),AreaOfCircle);
System.out.printf("the result is in two decimals: %.2f", AreaOfCircle);


}}
