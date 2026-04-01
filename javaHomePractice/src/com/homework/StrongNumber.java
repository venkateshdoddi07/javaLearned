
/*
 A number is called a Strong Number if the sum of the factorials of its digits is equal to the number.
 
 Number = 145

Digits: 1, 4, 5

1! = 1  
4! = 24  
5! = 120  

1 + 24 + 120 = 145
 */
package com.homework;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); // 145----> factorial of its individual number and its sum
        int originalNumber = n;
        int sum = 0;

        while (n > 0) { //145>0
            int digit = n % 10; //145%10

            // calculate factorial of digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i; //1*1--> 1*2=2---> until fact number
            }

            sum = sum + fact;
            n = n / 10;
        }

        if (sum == originalNumber) {
            System.out.println("This is a Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }

        scn.close();
    }
}