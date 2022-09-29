package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee registerEmployee(Employee emp){
		Employee savedEmployee= dao.save(emp);
		
		return savedEmployee;
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		Optional<Employee> opt= dao.findById(empId);
	
		return opt.orElseThrow(() -> new EmployeeException("Employee does not exist with empID :"+empId) );
		
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {

		List<Employee> employees= dao.findAll();
		
		if(employees.size() > 0)
			return employees;
		else
			throw new EmployeeException("No Employee found..");
		

	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		Employee existingEmployee= dao.findById(empId).orElseThrow(() -> new EmployeeException("Employee does not exist with Employee Id "+empId));;
		
		dao.delete(existingEmployee);
		
		
		return existingEmployee;
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {

		Optional<Employee> opt= dao.findById(emp.getEmpId());
		
		
		if(opt.isPresent()) {
			
			return dao.save(emp);
			
			
			//here save method will perform as saveOrUpdate based on Id field
			
		}
		else
			throw new EmployeeException("Invalid Employee details");
		
		
	}


}
