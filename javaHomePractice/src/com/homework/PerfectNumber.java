package com.homework;

import java.util.Scanner;

/*
A number is said to be a Perfect Number if the sum of its proper divisors (excluding itself) is equal to the number.

Number = 6

Divisors: 1, 2, 3   (excluding 6)

1 + 2 + 3 = 6
*/

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check perfect number or not");
        
        int number=sc.nextInt();
        
        int originalNumber=number;
        
        int sumDigit=0;
        
//        for(int i=1;i<number;i++) {
//        	
//        	if( number%i==0) {
//        		sumDigit+=i;
//        		
//        	}
//        	
//        }
        
        int i=1;
        
        while(number%i==0) {
        	sumDigit=sumDigit+i;
        	
        	i++;
        }
        
        
        if(sumDigit==originalNumber) {
        	System.out.println("it is perfect number");
        }else {
        	System.out.println("it is not a perfect number");
        }
       
        sc.close();
    }
}