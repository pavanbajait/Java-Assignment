package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;
import com.masai.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) throws EmployeeException {
		 
		return service.createEmployee(employee);
		
	}

	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) throws EmployeeException{
		Employee employee =service.getEmployeeDetailsById(id);
		
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	

	@DeleteMapping("/employee/{id}")//for deleteing plant we don't need plant we just need planter id
	public ResponseEntity<Employee> DeletePlant(@PathVariable("id") Integer id) throws EmployeeException{
		Employee employee=service.deleteEmployee(id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	
	
	
}
