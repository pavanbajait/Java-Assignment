package com.pbajait.dao;

import java.util.List;

import com.pbajait.model.Employee;
import com.pbajait.model.EmployeeException;

public interface EmployeeDao {
	
	public List<Employee> getAllEmployees() throws EmployeeException;
	
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException;
	
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException;
	
	public Object[] getEmployeeNameAndSalary(int empId)throws EmployeeException;
	
	public int getEmployeeSalaryById(int empId);
	
}
