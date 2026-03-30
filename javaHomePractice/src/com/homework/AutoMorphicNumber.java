package com.homework;
/*
 A number is said to be Automorphic if its square ends with the same digits as the number itself.
 
 Number = 25

Square = 25 * 25 = 625

625 ends with 25

 */

import java.util.Scanner;

public class AutoMorphicNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  // 25
        int square = n * n;// 25*25 =625

        int temp = n;//  original number in temporary value

        // Compare digits from last
        while (temp > 0) {  //25>0 
            if (temp % 10 != square % 10) { //
                System.out.println("Not an Automorphic Number");
                scn.close();
                return;
            }
            temp = temp / 10;
            square = square / 10;
        }

        System.out.println("Automorphic Number");

        scn.close();
    }
}