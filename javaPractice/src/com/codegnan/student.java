package com.codegnan;



	public class student{
			String name;
			int rollnumber;
			int[] marks;
			
			public student() {
				this.name="unknown";
				this.rollnumber=0;
				this.marks=new int[] {0,0,0};
				
			}
			public student(String name,int rollnumber,int[] marks) {
				this.name=name;
				this.rollnumber=rollnumber;
				this.marks=new int[3];
				for(int i=0;i<3;i++) {
					this.marks[i]=marks[i];
				}
				
				
		
				
				
			}
			public void displayStudentDetails() {
				System.out.println("name : "+name);
				System.out.println("rollnumber : "+rollnumber);
				System.out.println("marks : ");
				for(int i=0;i<marks.length;i++) {
					System.out.println("subject : "+(i+1)+" marks : "+marks[i]);
				}
				
				
			}public int total() {
				int total=0;
				for(int mark:marks) {
					total+=mark;
				}
				return total;
			}
			
			public double calculateAverage() {
				return total()/3.0;
			}
			

}
