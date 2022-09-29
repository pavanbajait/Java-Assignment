package com.pbajait.usecases;

import java.util.List;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Employee;
import com.pbajait.model.EmployeeException;

public class GetSalaryByEmpId {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			int salary = dao.getEmployeeSalaryById(4);
			System.out.println("Employee Salary by Employee Id: "+salary);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
