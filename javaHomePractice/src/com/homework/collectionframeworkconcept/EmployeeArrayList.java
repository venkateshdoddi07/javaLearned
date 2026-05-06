package com.homework.collectionframeworkconcept;

public class EmployeeArrayList {

		private int empId;
		private String empName;
		private int salary;
		
		EmployeeArrayList(int empId,String empName,int salary){
			super();
			this.empId=empId;
			this.empName=empName;
			this.salary=salary;
			
			
		}
		
		public  String toString() {
			
			return "id: "+empId+"name: "+empName+"salary: "+salary;
			
		}
		
		public int getId() {
			return empId;
		}
		public void setId(int id) {
			this.empId=id;
		}
		
		public String getName() {
			return empName;
		}
		public void setId(String name) {
			this.empName=name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary=salary;
		}
}

