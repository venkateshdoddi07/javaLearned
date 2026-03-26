//A grocery store application calculates the total bill by multiplying the price of an item (which is a double) with the quantity 
//purchased (which is an int). After calculating the total, the application rounds the result to the nearest lower whole number
// for display.
package com.homework;

import java.util.Scanner;
public class GroceryStorePOS{

public static void main (String[] args){

	Scanner scn=new Scanner(System.in);
//Enter  how many items

System.out.println("Enter how many items are listed");

	int N =scn.nextInt();
//loop for enter individual items

double TotalPrice=0.0;
double result=0;

	for(int i=1;i<=N;i++){
	System.out.println("Enter the price of an item");

	double ItemPrice=scn.nextDouble();

	System.out.println("Enter its quantity of an item");

	int Totalquantity=scn.nextInt();

	result=(ItemPrice*Totalquantity);
		TotalPrice+=result;

//TotalPrice=+ItemPrice*Totalquantity;

}

System.out.println("the total value of the groceries is : " +TotalPrice);




}
}
