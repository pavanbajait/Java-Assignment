package com.myDao.usecases;

import java.util.Scanner;

import com.myDao.Dao.EmployeeDao;
import com.myDao.Dao.EmployeeDaoImpl;

public class InsertEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int empId = sc.nextInt();
		System.out.println("Enter the Employee name");
		String name = sc.next();
		System.out.println("Enter the Employee Address");
		String address = sc.next();
		System.out.println("Enter the Employee Salary");
		int salary = sc.nextInt();
		
		EmployeeDao emp = new EmployeeDaoImpl();
		
		String result = emp.insertEmployeeDetails(empId, name, address, salary);
		
		System.out.println(result);

	}

}
