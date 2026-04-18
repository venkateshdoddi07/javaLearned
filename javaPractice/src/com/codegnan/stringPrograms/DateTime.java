package com.codegnan.stringPrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {

	public static void main(String[] args) {
//LocalTime time=LocalTime.now();
//
//int hour=time.getHour();
//int min=time.getMinute();
//int sec=time.getSecond();
//int nansec=time.getNano();
//
//System.out.printf("formatted time: %d-%d-%d-%d", hour,min,sec,nansec);
//
//
//
//LocalDateTime dt= LocalDateTime.now();
//System.out.println("date and time : "+ dt);

//LocalDateTime dt1=LocalDateTime.of(2000,Month.DECEMBER,23,12,45,20);
//System.out.println("setting date time :"+dt1);
//
//
//System.out.println("After 6 months the date will be:"+dt1.plusMonths(6));,,,,,,,,
//
//
//ZoneId zone=ZoneId.systemDefault();
//System.out.println("default time zone "+zone);
//
//
//ZoneId la=ZoneId.of("America/Los_Angeles");
//ZonedDateTime zt=ZonedDateTime.now(la);
//System.out.println(zt);
		
		
		
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(1996, 12,23);
		Period p=Period.between( birthday,today);
		System.out.printf("my age is %d years, %d months, and %d days %n" ,p.getYears(),p.getMonths(),p.getDays());

	}

}
