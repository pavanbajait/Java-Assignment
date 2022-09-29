package com.pbajait.usecases;

import java.util.Scanner;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the employee Id to delete the employee details:");
		int empId = sc.nextInt();
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee e;
		try {
			e = dao.getEmployeeById(empId);
			System.out.println("Details of Deleted Employee with auto-generated employee ID"+e);

		} catch (EmployeeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
			
		
	}

}
