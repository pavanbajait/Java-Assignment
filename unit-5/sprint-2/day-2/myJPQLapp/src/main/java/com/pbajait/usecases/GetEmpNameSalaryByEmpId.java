package com.pbajait.usecases;

import java.util.List;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Employee;
import com.pbajait.model.EmployeeException;

public class GetEmpNameSalaryByEmpId {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			Object[] or = dao.getEmployeeNameAndSalary(6);
			System.out.println("Name Of an Employee: "+or[0]);
			System.out.println("Salary Of an Employee: "+or[1]);
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
