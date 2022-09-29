package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.masai.exception.EmployeeException;

import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@ControllerAdvice
public class EmployeeControllerHandler {
	
	@Autowired
	private EmployeeService emplservice;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> registerEmployeeHAndler(@RequestBody Employee empId){
		Employee registerempl= emplservice.registerEmployee(empId);
		
		return new ResponseEntity<Employee>(registerempl, HttpStatus.CREATED);
		
	}
	
	
	@DeleteMapping("/employee/{empId}")
	public ResponseEntity<Employee> deleteEmployeeByIdHandler(@PathVariable("empId") Integer empId) throws EmployeeException{
		
		Employee employee= emplservice.deleteEmployeeById(empId);
		
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}
	

	@GetMapping("/getemployeebyid/{empId}")
	public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable("empId") Integer empId) throws EmployeeException{
		
		Employee employee= emplservice.getEmployeeById(empId);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		
	}
	

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployeeDetailsHandler() throws EmployeeException{
		
		List<Employee> employees= emplservice.getAllEmployeeDetails();
		
		
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
		
	}
	
	@PutMapping("/employeesupdate")
	public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee employee) throws EmployeeException{
		
		Employee updatedemployee= emplservice.updateEmployee(employee);
		
		
		return new ResponseEntity<Employee>(updatedemployee,HttpStatus.OK);
		
	}
	
	

}
