package com.homework;

//problem 4: write a program to print the 2d array
/* 1.Take M and N from user
 2.Create a 2D array of dimension M*N.
 3.Fill that array from user.
 4.Print that array row by row
* 
*/
import java.util.Scanner;
public class Array_2D_Print {
 public static void main(String args[]){
try(Scanner sc=new Scanner(System.in)){
 //step1
     int M =sc.nextInt();
     int N=sc.nextInt();
 //step2
     int[][] mat=new int[M][N];
 //step3
         for(int i=0;i<M;i++){
             for(int j=0;j<N;j++){
              mat[i][j]=sc.nextInt();
             }
         }System.out.println();
 //step4
         for(int i=0;i<M;i++){
             for(int j=0;j<N;j++){
             System.out.print(mat[i][j]+" ");
         }System.out.println();


     }


}

}

}
