package com.homework;
/*Question26) print Diamond Hollow Pattern
    *
   * *
  *   *
 *     *
*       *
*        *
*       *
 *     *
  *   *
   * *
    *
*/

import java.util.Scanner;
public class PatternDiamondHallow {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
			int N=scn.nextInt();
			for(int i=1;i<=N;i++) {
				
				for(int j=1;j<=N-i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++) {
					if(j==1 || j==2*i-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			//lower part
			for(int i=N;i>=1;i--) {
				
				for(int j=1;j<=N-i;j++) {
					
					System.out.print(" ");
					
				}
				for(int j=1;j<=2*i-1;j++) {
					if(j==1 || j==2*i-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
				
				
			}
	
		
scn.close();

	}

}
