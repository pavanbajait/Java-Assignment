package com.masai.services;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeService {

	Employee createEmployee(Employee employee) throws EmployeeException;

	Employee getEmployeeDetailsById(Integer id) throws EmployeeException;

	Employee deleteEmployee(Integer id) throws EmployeeException;

}
