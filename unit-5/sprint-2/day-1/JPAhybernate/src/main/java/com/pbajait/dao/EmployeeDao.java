package com.pbajait.dao;

import com.pbajait.model.Employee;
import com.pbajait.usecases.EmployeeException;

public interface EmployeeDao {
	
	public Employee registerEmployee(Employee employee) throws EmployeeException;
	// the above method take an Employee object without an empId and returned the
	//registered Employee object having the autogenerated Id
	
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
	public Employee deleteEmployeeById(int empId) throws EmployeeException;
	
	public Employee updateEmployee(Employee employee) throws EmployeeException;
	

}