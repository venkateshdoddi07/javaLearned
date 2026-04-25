package com.homework.controller;

import java.util.List;
import java.util.Scanner;

import com.homework.beans.Employee;
import com.homework.exceptions.EmployeeNotFoundException;
import com.homework.service.EmployeeService;
import com.homework.service.EmployeeServiceImpl;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		Scanner scn = new Scanner(System.in);
		int choice;
		do {
			System.out.println("====Employee management system===");
			System.out.println("===option 1: Add Employee=====");
			System.out.println("===option 2: view all Employee=====");
			System.out.println("===option 3: get employee by id =====");
			System.out.println("===option 4: update Employee=====");
			System.out.println("===option 5: delete Employee=====");
			System.out.println("===option 6: exit=====");
			System.out.println("Enter your choice");
			choice = scn.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter Id: ");
				int id = scn.nextInt();
				scn.nextLine();

				System.out.print("Enter Name: ");
				String name = scn.nextLine();

				System.out.println("Enter salary: ");
				double salary = scn.nextDouble();
				service.addEmployee(new Employee(id, name, salary));
				break;

			case 2:
				System.out.println("===All Employee====");
				List<Employee> employees = service.getAllEmployee();
				for (Employee emp : employees) {
					System.out.println(emp);
				}
				break;

			case 3:
				System.out.println("Enter employee Id : ");
				int searchId = scn.nextInt();
				try {
					Employee emp = service.getEmployeeById(searchId);
					System.out.println("Found :" + emp);
				} catch (EmployeeNotFoundException e) {
					e.printStackTrace();
				}
				break;

			case 4:
				System.out.println("Enter id to update : ");
				int updateId = scn.nextInt();
				scn.nextLine();
				System.out.println("Enter Name : ");
				String newName = scn.nextLine();
				System.out.println("Enter salary: ");
				double newSalary = scn.nextDouble();
				try {
					Employee updatedemp = service.updateEmployee(new Employee(updateId, newName, newSalary));
					System.out.println("Employee updated sucessfully " + updatedemp);
				} catch (EmployeeNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("Enter id to delete : ");
				int deleteId = scn.nextInt();
				try {
					service.deleteEmployee(deleteId);
					System.out.println("employee deleted successfully");
				} catch (EmployeeNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case 6:
				System.out.println("Exiting program");
				break;
			default:
				System.out.println("Invalid choice try again");
			}

		} while (choice != 6);
		scn.close();

	}

}
