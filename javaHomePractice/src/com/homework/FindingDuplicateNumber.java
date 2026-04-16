package com.homework;

//find duplicate number in the array
import java.util.Scanner;

public class FindingDuplicateNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int[] array=new int[size];
		
		for(int i =0;i<array.length;i++) {
			array[i]=scn.nextInt();
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]==array[j]) {
					System.out.println(array[i]);
				}
				
			}
		}
		
		
	}

}
