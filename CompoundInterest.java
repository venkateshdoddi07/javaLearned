/* Q3:
 Write a Java program to calculate Compound Interest and Total Amount.
 Input values should include:
Principal (double)

Rate of Interest in % (double)
Time in years (double)
 Use the formula:
 Amount = P × (1 + R/100)ᵀ
 Compound Interest = Amount − Principal
 Display the compound interest and total amount rounded to two decimal places. */


import java.util.Scanner;
public class CompoundInterest{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);

//Take principal value in double as "P"
System.out.println("Enter Principal amount");
double P=scanner.nextDouble();

//take Rate of interest as double as "R"
System.out.println("Enter rate of Interest");
double R=scanner.nextDouble();

//take Time in years as double as "T"
System.out.println("Enter Time in years");
double T=scanner.nextDouble();

//use formula: Amount=P x (1+R/100)^T

double Amount=P * Math.pow(1+(R/100),T);

//now find compound interest , CompoundInterest= Amount - Principal

double CompoundInterest = Amount - P;

double TotalAmount = CompoundInterest+P;

//Display: CompoundInterest, total amount rounded to two decimal places.
System.out.printf("the compound interest is : %.2f/n ", CompoundInterest);
System.out.printf("the total amount is : %.2f/n ", TotalAmount);

}
}
