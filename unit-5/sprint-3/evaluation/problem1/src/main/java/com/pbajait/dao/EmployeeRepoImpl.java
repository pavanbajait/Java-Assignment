package com.pbajait.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pbajait.model.Employee;

@Service
public class EmployeeRepoImpl implements EmployeeRepo{

	@Override
	public boolean saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
