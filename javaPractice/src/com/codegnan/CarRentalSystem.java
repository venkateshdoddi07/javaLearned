package com.codegnan;

import java.util.Scanner;

public class CarRentalSystem {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		
		Car c1=new Car();
		
		c1.setModel(scn.nextLine());
		c1.setYear(scn.nextInt());
		
		System.out.println("model : "+ c1.getModel()+ " car year : "+c1.getYear());
		
		scn.close();
	}

}
