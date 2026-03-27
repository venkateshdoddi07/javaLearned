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
		Scanner scanner=new Scanner(System.in);
				int number=scanner.nextInt(); //19
				
				int sum=0;
				int square=2;
				
				while(number>0) {
					int digit=number%10;//9,1
					sum=(int)(sum+Math.pow(digit, square));
					number/=10;
			
				}
				System.out.println((int)sum);
				
		
		scanner.close();
	}

}
