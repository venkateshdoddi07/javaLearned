package com.codegnan.stringPrograms;

public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		
		//create human object
		
		Human h1=new Human("suman");
		Robot r1=new Robot("r2d2");
		
		System.out.println("human daily routine");
		h1.work();
		h1.work();
		h1.takeBreak();
		h1.eat();
		h1.digest();
		h1.work();
		h1.sleep();
		h1.wakeUp();
		h1.showStatus();
		
		System.out.println("robot operations");
		r1.work();
		r1.work();
		r1.work();
		r1.work();
		r1.work();
		r1.work();
		r1.takeBreak();
		r1.charge();
		r1.work();
		
		
		
		
		
	}

}
