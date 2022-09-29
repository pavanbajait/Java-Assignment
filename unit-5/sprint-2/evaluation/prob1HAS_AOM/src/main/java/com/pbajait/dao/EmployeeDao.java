package com.pbajait.dao;

import java.util.List;

import com.pbajait.model.Department;
import com.pbajait.model.DepartmentException;
import com.pbajait.model.Employee;
import com.pbajait.model.EmployeeException;

public interface EmployeeDao {
	
	public void addDepartment(Department dept);
//	–this method should add a new dept object without having any employee
//	object.
	
	public void addEmployee(Employee emp);
//	- This method should add a new employee obj without having any dept details.
	
	
	public void registerEmployeeTODepartment(int empId, int deptId)throws EmployeeException, DepartmentException;
//	–this method should register the employee to the particular department, if supplied
//	empId related employee does not exist then throw the EmployeeException and if the
//	supplied deptId related Department does not exist then throw the
//	DepartmentExcpetion with proper message.
	
//	
	public List<Employee> getAllEmployeeWithDeptName(String deptName)throws EmployeeException, DepartmentException;
//	EmployeeException;
////	– This method should return a list of all employees working in a particular
////	department. If there is no employee in supplied department then throws the
////	EmployeeException with proper message.
//	
//	
	public Department getDepartmentDetailsByEmployeeId(int empId)throws DepartmentException;
//	DepartmentExcpetion;
////	–this method returns the Department details of a particular Employee. Otherwise
////	throws DepartmentException with the proper message.

}
