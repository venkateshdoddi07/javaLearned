package com.homework;

import java.util.Scanner;

public class PatternHollowPyramid {

	    public static void main(String[] args) {
	    	Scanner scn=new Scanner(System.in);
	        int n = scn.nextInt(); // number of rows

	        for (int i = 1; i <= n; i++) {

	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars and hollow spaces
	            for (int j = 1; j <= 2 * i - 1; j++) {
	            	
	                if (i == 1 || i == n || j == 1 || j == 2 * i - 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }

	            
	            System.out.println();
	        }
	        scn.close();
	    }
	}