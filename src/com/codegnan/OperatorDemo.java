package com.codegnan;
public class OperatorDemo{

	public static void main (String[] args){


	System.out.println("==Arthemetic operators==");
	int a=17,b=5;
	System.out.println("a= "+a + "b= "+b);
	System.out.println("a+b = "+ (a+b));
	System.out.println("a-b = "+ (a-b));
	System.out.println("a*b = "+ (a*b));
	System.out.println("a/b = "+ (a/b));
	System.out.println("a%b = "+ (a%b));

	System.out.println();
	System.out.println("==Relational Operators==");
	int marks =72;
	System.out.println("marks= "+marks);
	System.out.println("marks>50= "+(marks>=50));
	System.out.println("marks==100= "+(marks==100));
	System.out.println("marks!=60= "+(marks!=60));
	System.out.println("marks>50 "+(marks>50));
	System.out.println("marks<50= "+(marks<50));

	System.out.println();
	System.out.println("==logical operators==");
	int age=22;
	boolean hasLicence= true;
	boolean canDrive=(age>=18) && hasLicence;
	System.out.println("Age>=18 hasLicence: " +canDrive);
	boolean isMinorOrSenior=(age<18) || (age>60);
	System.out.println("Age<18 || Age>60 : " + isMinorOrSenior);
	boolean notMinor=!(age<18);
	System.out.println("!(Age<18 : )"+ notMinor);

	System.out.println();

	System.out.println("===Compound Assignment Operators===");
	int score=100;
	System.out.println("Initial Score : " +score );
	score+=10; //score=score+10;
	System.out.println("After += 10 : "+score);
	score -=5;
	System.out.println("After -= 5: "+score);
	score *=2;
	System.out.println("After *= 2: "+score);
	score /=3;
	System.out.println("After /3: "+score);
	score %=8;
	System.out.println("After %= 8: "+score);

	System.out.println();

	System.out.println("operators completed");



}
}
