package com.codegnan;

import java.util.Scanner;

public class DentistAppointment extends Appointment {

	public void schedule() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter dentist procedure");
		String input2=scn.nextLine();
		System.out.println("Dentist apointment schedule for "+ input2);
		
		
	}
	
}
