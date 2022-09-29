package com.pbajait.dao;

import java.util.List;

import com.pbajait.model.Employee;

public interface EmployeeService {
	
	public boolean saveEmployee(Employee emp);
	public List getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;


}
