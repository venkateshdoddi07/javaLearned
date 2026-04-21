package com.codegnan.stringPrograms;

public class Robot implements Workable {
private String model;
private int batteryLevel;
private boolean isWorking;


	public Robot(String model) {
	super();
	this.model = model;
	this.batteryLevel = 100;
	this.isWorking = false;
}

	@Override
	public void work() {
		if(batteryLevel>10) {
			isWorking=true;
			batteryLevel-=15;
			System.out.println("robot : "+ model + "is working. battery level :"+batteryLevel + "%");
		}else {
			System.out.println("robot  "+model + "needs charging");
		}
				
	}

	@Override
	public void takeBreak() {
		isWorking=false;
		System.out.println("robot :"+model+"is in standby mode");
	}

	
	public void charge() {
		batteryLevel=100;
		System.out.println("robot "+model+"is fully charged");
	}
	

}
