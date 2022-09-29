package com.pavan.usecases;

import java.util.List;

import com.pavan.dao.EmployeeDao;
import com.pavan.dao.EmployeeDaoImpl;
import com.pavan.exceptions.Employee3Exception;
import com.pavan.model.Employee3;

public class GetAllEmployees {
	
	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		
		try {
			List<Employee3> employee = emp.getAllEmployeesDetails();
			employee.forEach(s -> {
				System.out.println(s);
			});
			
		}catch(Employee3Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
