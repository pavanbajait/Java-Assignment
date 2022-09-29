package com.myDao.Dao;

import java.util.List;

import com.myDao.exceptions.EmployeeException;
import com.myDao.modelBean.Employee;

public interface EmployeeDao {

	public String insertEmployeeDetails(int empId, String name, String address, int salary);
	
	public List<Employee> getAllEmployee() throws EmployeeException;
	
	public String giveBonusToEmployee(int empId, int bonus);
	
	public boolean deleteEmployee(int empId) ;
	
	public String[] getNameAndAddress(int empId) throws EmployeeException;
}
