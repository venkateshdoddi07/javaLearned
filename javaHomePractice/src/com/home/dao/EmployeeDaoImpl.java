package com.home.dao;

import java.util.ArrayList;
import java.util.List;

import com.homework.beans.Employee;
import com.homework.exceptions.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {
	private List<Employee>employeeList=new ArrayList<>();

	@Override
	public void save(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	public List<Employee> findAll() {
		
		return employeeList;
	}

	@Override
	public Employee findById(int id) throws EmployeeNotFoundException {
		for(Employee e:employeeList) {
			if(e.getId()==id) {
				return e;
			}
		}
		throw new EmployeeNotFoundException("Employee with ID :"+ id + " not found");
	}

	@Override
	public Employee update(Employee employee) throws EmployeeNotFoundException {
		for(int i=0;i<employeeList.size();i++) {
			if(employeeList.get(i).getId()==employee.getId()) {
				employeeList.set(i, employee);
				return employee;
			}
		}
		throw new EmployeeNotFoundException("Employee with ID :"+ employee.getId() + " not found for update");
	}

	@Override
	public void deleteById(int id) throws EmployeeNotFoundException {
		boolean found=false;
		for(int i=0;i<employeeList.size();i++) {
			if(employeeList.get(i).getId()==id) {
				employeeList.remove(i);
				found=true;
				break;
			}
		}
		if(!found) {
			throw new EmployeeNotFoundException("Employee with ID :"+ id+ " not found for delete");

		}
	}

}
