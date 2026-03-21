package com.codegnan;
import java.util.Scanner;
public class NestedIfElse{
		public static void main(String[] args){
				Scanner scanner=new Scanner(System.in);
				System.out.println("please enter the marks between 0 to 100 only ");
						int marks=scanner.nextInt();

					if(marks>=100 || marks<0){
					System.out.println("you have enter more than 100 or less than 0 please check");
					return;
						}
						else{
											char grade;
											String remark;
											String status;

							if(marks>=90){
												grade='A';
												remark="Excellent";
												status="pass";
							}
							else{
							if(marks>=80){
												grade='B';
												remark="very good";
												status="pass";
							}
							else{
							if(marks>=70){
												grade='C';
												remark="good";
												status="pass";
							}
							else{
							if(marks>=60){
												grade='D';
												remark="satisfactory";
												status="pass";
							}
							else{
							if(marks>=50){
												grade='E';
												remark="just pass";
												status="pass";
							}
							else{
							if(marks<50){
												grade='F';
												remark="fail";
												status="fail";
								}
						}
								}
						}
								}
						}

								}

	System.out.println(" the 
}
}