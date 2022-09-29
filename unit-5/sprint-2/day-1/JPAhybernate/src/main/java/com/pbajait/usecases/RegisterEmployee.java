package com.pbajait.usecases;

import java.util.Scanner;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Employee;

public class RegisterEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Name:");
		String name = sc.next();
		System.out.println("Enter the Employee Address:");
		String adr = sc.next();
		System.out.println("Enter the Employee Salary:");
		int slry = sc.nextInt();
		
		Employee emp = new Employee(name, adr, slry);
		
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee e;
		try {
			e = dao.registerEmployee(emp);
			System.out.println("Details of Employee with auto-generated employee ID"+e);
		} catch (EmployeeException e1) {
			System.out.println("Technical Error....");
		}
	}

}
