package com.home.dao;

import java.util.List;

import com.homework.beans.Employee;
import com.homework.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {
	public void save(Employee employee);

	public List<Employee> findAll();

	public Employee findById(int id) throws EmployeeNotFoundException;

	public Employee update(Employee employee) throws EmployeeNotFoundException;

	public void deleteById(int id) throws EmployeeNotFoundException;

}
