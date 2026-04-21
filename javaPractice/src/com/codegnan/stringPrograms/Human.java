package com.codegnan.stringPrograms;



public class Human implements Workable, Eatable, Sleepable {
	String name;
	boolean isAwake;
	boolean isWorking;
	int energyLevel;

	public Human(String name) {
		super();
		this.name = name;
		this.isAwake = true;
		this.isWorking = false;

	}

	@Override
	public void wakeUp() {

	}

	@Override
	public void eat() {
		energyLevel += 30;
		if (energyLevel > 100) {
			energyLevel = 100;
			System.out.println(name + "is eating . energy level : " + energyLevel);
		}
	}

	public void digest() {
	
		
	}
		
		
public void sleep() {
	isAwake=false;
	isWorking=false;
	energyLevel=100;
	System.out.println(name+"is sleeping enercy restored to "+energyLevel);

}
	


	@Override
	public void work() {
		isAwake=true;
		isWorking=true;
		if(energyLevel>20) {
			energyLevel-=10;
		}
		
		
		
	}

	@Override
	public void takeBreak() {
		if (isWorking) {
			isWorking = false;
			energyLevel += 10;
			System.out.println(name + "is taking a break .enery level : " + energyLevel);

		}
	}
	public void showStatus() {
		System.out.println("name : "+name);
		System.out.println("Awake : "+isAwake);
		System.out.println("Working : "+isWorking);
		System.out.println("Energy : "+ energyLevel);
		System.out.println();
	}

}
