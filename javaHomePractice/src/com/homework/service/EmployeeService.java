package com.homework.service;

import java.util.List;
import com.homework.beans.Employee;
import com.homework.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
 void addEmployee(Employee employee);
List<Employee> getAllEmployee();
	Employee getEmployeeById(int id) throws EmployeeNotFoundException;
	void updateEmployee(Employee employee) throws EmployeeNotFoundException;
 void deleteEmployee(int id) throws EmployeeNotFoundException;
	
	

}
