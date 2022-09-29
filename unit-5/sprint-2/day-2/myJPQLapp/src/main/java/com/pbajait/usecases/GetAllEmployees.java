package com.pbajait.usecases;

import java.util.List;

import com.pbajait.dao.*;
import com.pbajait.model.Employee;
import com.pbajait.model.EmployeeException;

public class GetAllEmployees {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List<Employee> ls = dao.getAllEmployees();
			ls.forEach(e -> System.out.println(e));
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
