package com.codegnan.service;

import java.util.List;

import com.codegnan.Exceptions.EmployeeNotFoundException;
import com.codegnan.beans.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee employee);
		List<Employee>getAllEmployees();
		Employee getEmployeeById(int id) throws EmployeeNotFoundException;
		void updateEmployee(Employee employee)throws EmployeeNotFoundException;
		void deleteEmployee(int id) throws EmployeeNotFoundException;
	

}
