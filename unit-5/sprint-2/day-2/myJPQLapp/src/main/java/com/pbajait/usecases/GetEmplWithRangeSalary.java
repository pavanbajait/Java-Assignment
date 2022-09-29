package com.pbajait.usecases;

import java.util.List;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Employee;
import com.pbajait.model.EmployeeException;

public class GetEmplWithRangeSalary {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List<Employee> ls = dao.getAllEmployeeWithRangeSalary(2000, 5000);
			ls.forEach(e -> System.out.println(e));
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
