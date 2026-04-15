package com.codegnan;

public class AppointmentMain {

	public static void main(String[] args) {
		Appointment a=new Appointment();
		a.schedule();
		
		a=new DoctorAppointment();
		a.schedule();
		
		a=new DentistAppointment();
		a.schedule();
		
		
	}

}
