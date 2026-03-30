package com.homework;
/*6 Print Array Elements in Reverse Order
 Problem Statement
Write a program to print the elements of an array in reverse order.*/
import java.util.Scanner;
public class ArrayReverse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		//enter elements
		int size=scn.nextInt();
		
		//enter values
		int [] array=new int[size];
		for(int i=0;i<array.length;i++) {
			
			array[i]=scn.nextInt();//10,20,30,40,50
		}
		//reverse array
		for(int i=array.length-1;i>=0;i--) { //i=4 ,4>0 :: i>=3, 3>=0 : :.... 0>=0, -1>=0(false)
			System.out.println(array[i]);
			
		}

	}

}
