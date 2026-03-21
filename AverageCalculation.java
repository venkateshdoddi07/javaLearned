//2. A school management system calculates a student’s average score across three tests. The scores are stored as integers, but the average is computed as a decimal (floating-point value). For display purposes, the average /is also shown as a whole number by rounding down. 


import java.util.Scanner;
public class AverageCalculation{

public static void main(String[] args){
	Scanner scn=new Scanner(System.in);

	System.out.println("Enter quarterly score");
		int quarterly = scn.nextInt();
	System.out.println("Enter halfyearly score");
		int halfyearly=scn.nextInt();
	System.out.println("Enter annual score");
		int annual =scn.nextInt();

		double AverageScores=(double)(quarterly+halfyearly+annual)/3;

		System.out.println("The average of three scores is : "+ AverageScores);
		System.out.println();
		System.out.println("The below average is shown as a whole number by rounding down");
		System.out.println();
		System.out.println((int)AverageScores); 

}
}
