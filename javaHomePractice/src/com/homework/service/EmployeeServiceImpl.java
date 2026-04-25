package com.homework.service;

import java.util.List;

import com.home.dao.EmployeeDao;
import com.home.dao.EmployeeDaoImpl;
import com.homework.beans.Employee;
import com.homework.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.save(employee);		
		System.out.println("Employee added: "+employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
				return employeeDao.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		return employeeDao.update(employee);
	}

	@Override
	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		employeeDao.deleteById(id);		
	}

}
