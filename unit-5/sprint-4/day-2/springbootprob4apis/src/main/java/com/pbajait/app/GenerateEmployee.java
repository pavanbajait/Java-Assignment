package com.pbajait.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateEmployee {
	
	@RequestMapping("/employee")
	public Employee genEmp() {
		
		Employee emp = new Employee(1,"pavan",5000);
		
		return emp;
		
	}
	
	@RequestMapping("/employeelist")
	public List<Employee> genEmpList() {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"pavan",5000));
		list.add(new Employee(2,"shubham",6000));
		list.add(new Employee(3,"aksh",4000));
		list.add(new Employee(4,"pankaj",3000));
		list.add(new Employee(5,"nehal",5500));
		
		
		return list;
		
	}
	
	@RequestMapping("/hello")
	public String message() {
		
		return "Welcome to Spring Boot";
		
	}

}
