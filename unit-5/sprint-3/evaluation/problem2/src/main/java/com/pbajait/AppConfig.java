package com.pbajait;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.pbajait")
public class AppConfig {
	

	@Bean("theList")
	public List<Employee> getEmployee(){
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1,"Ram",6400));
		emp.add(new Employee(2,"pavan",6500));
		emp.add(new Employee(3,"shubham",7400));
		emp.add(new Employee(4,"pankaj",6000));
		emp.add(new Employee(5,"akash",7000));
		
		return emp;
	}
	
	@Bean("theMap")
	public Map<Department, Employee> getMap(){
		Map<Department, Employee> theMap=new HashMap<Department, Employee>();
		
		theMap.put((new Department(11, "sales", "Ngp")), new Employee(1,"Ram",6400));
		theMap.put(new Department(12, "Electrical", "Mumbai"), new Employee(2, "pavan", 6500));
		theMap.put(new Department(13, "HR", "Pune"), new Employee(3,"shubham",7400));
	
		return theMap;
	}
	
	

}
