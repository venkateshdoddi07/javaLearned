package com.homework;

/*
 A number is called a Happy Number if repeatedly replacing it with the sum of the squares of its digits results in 1.
 
 Number = 19

1² + 9² = 82  
8² + 2² = 68  
6² + 8² = 100  
1² + 0² + 0² = 1
 */
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//19

        int result = num;

        while (result != 1 && result != 4) {//19>1 && 19>4
            int sum = 0;

            while (result > 0) {//19>0
                int digit = result % 10;//9--->
                sum += digit * digit;
                result /= 10;
            }

            result = sum;
        }

        if (result == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}