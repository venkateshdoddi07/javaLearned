package com.codegnan;

import java.util.Scanner;

public class DoctorAppointment extends Appointment {
	public void schedule() {
		Scanner scn=new Scanner(System.in);
		System.out.println("specialisation");
		String input=scn.nextLine();
		System.out.println("doctor appointment schedule for  "+ input);
		System.out.println();
		
		
	}

}
