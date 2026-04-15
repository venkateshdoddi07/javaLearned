package com.codegnan;



public class Main {

	public static void main(String[] args) {

		
//			EmployeeBaseClass emp1=new EmployeeBaseClass("venk", 1000);
//			emp1.calculateSalary();
//			
//			
//			ManagerSubClass mgr1=new ManagerSubClass("suma", 1000);
//			
//			mgr1.calculateSalary();
//			mgr1.calculateSalary(5000);
//			mgr1.calculateSalary(5000,7000);
		Figure f=new Figure(10,10);
//		f.area();
//
//		
//		Rectangle r1=new Rectangle(9, 4);
//		System.out.println(r1.area());
//		
//		Triangle t=new Triangle(10,8);
//		System.out.println(t.area());
//		
		
		//dynamic methid dispatch
		
		f=new Rectangle(5,6);
		System.out.println(f.area());
		f=new Triangle(10,5);
		System.out.println(f.area());
		
		
			
	}

}
