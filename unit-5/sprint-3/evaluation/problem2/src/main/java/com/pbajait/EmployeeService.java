package com.pbajait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("AppName.properties")
public class EmployeeService {
	
	@Autowired(required = false)
	Map<Department, Employee> theMap; // inject 3 entries
	
	@Autowired(required = false)
	List<Employee> theList; //inject List of 5 Employee object
	
	@Value("${appName}")
	private String appName; //inject the AppName from the properties file
	//Hint: Make use of @Bean annotation to inject theMap and theList;
	
	

	
	public void printMap(){
		
		Set<Map.Entry<Department,Employee>> set = theMap.entrySet();
		System.out.println("the employee's and their department's details :");
		for(Map.Entry<Department,Employee> me: set) {
		
			System.out.println(me.getKey()+" ==== "+me.getValue());
		}
		
	}
	
	public void printList() {
		
		Collections.sort(theList, (o1, o2) -> (o1.getSalary() > o2.getSalary()) ? -1 :
            (o1.getSalary() < o2.getSalary()) ? 1 : 0);
		System.out.println("List of Employees sorted by their slary:");
		for(Employee ls : theList) {
			System.out.println(ls);
		}
	}

	public void printAppName(){
		
		System.out.println(appName);
		
	}
	
	


}
