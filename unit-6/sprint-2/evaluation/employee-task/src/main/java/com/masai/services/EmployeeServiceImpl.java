package com.masai.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee createEmployee(Employee employee) throws EmployeeException {
		Optional<Employee> opt= dao.findById(employee.getId());
		
		if(opt.isPresent()) {
			
			throw new EmployeeException("Employee Already exist");
			//here save method will perform as saveOrUpdate based on Id field
		}
		else
			return dao.save(employee);
	}

	@Override
	public Employee getEmployeeDetailsById(Integer id) throws EmployeeException {
		Employee obj= dao.findById(id).orElseThrow(() -> new EmployeeException("Employee does not exist with Employee Id "+id) );
		
		return obj;
	}

	@Override
	public Employee deleteEmployee(Integer id) throws EmployeeException {
		Employee existingEmployee= dao.findById(id).orElseThrow(() -> new EmployeeException("Employee does not exist with Employee Id "+id));;
		
		dao.delete(existingEmployee);
				
		return existingEmployee;
	}

}
