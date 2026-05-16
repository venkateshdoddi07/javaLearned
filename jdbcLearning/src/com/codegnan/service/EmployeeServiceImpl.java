package com.codegnan.service;

import java.util.List;

import com.codegnan.Exceptions.EmployeeNotFoundException;
import com.codegnan.beans.Employee;
import com.codegnan.dao.EmployeeDao;
import com.codegnan.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao employeeDao=new EmployeeDaoImpl();

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.save(employee);		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
		
		return employeeDao.findById(id);
	}

	@Override
	public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
		employeeDao.update(employee);
	}

	@Override
	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		employeeDao.deleteById(id);		
	}

}
