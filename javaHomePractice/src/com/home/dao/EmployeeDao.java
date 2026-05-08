package com.home.dao;

import java.util.List;

import com.homework.beans.Employee;
import com.homework.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {
	void save(Employee employee);

 List<Employee> findAll();

	 Employee findById(int id) throws EmployeeNotFoundException;

	void update(Employee employee) throws EmployeeNotFoundException;

	void deleteById(int id) throws EmployeeNotFoundException;

}
