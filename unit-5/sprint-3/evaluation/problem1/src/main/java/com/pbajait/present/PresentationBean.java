package com.pbajait.present;

import com.pbajait.dao.EmployeeService;

public class PresentationBean {

	private EmployeeService empService; //dependency
	public void insertEmployee(){
	//take the input from the user (Employee Details without empId, empId should be
//	generated automatically)and call the saveEmployee method on the
	//empService object.
	}
	public void printAllEmployee(){
	//call the getAllEmployee method on the empService object and print all the
	//employee details.
	}
	public void searchEmployee(){
	// take the empId from the user and call the getEmployeeById method on the
	//empService obj. And print the appropriate details.
	}
	public void deleteEmployee(){
	// take the empId from the user and call the deleteEmployeeById method on the
	//empService obj. And print the appropriate details.
	}	
	
}
