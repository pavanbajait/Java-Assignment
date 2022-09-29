package com.pavan.usecases;

import java.util.Scanner;

import com.pavan.dao.EmployeeDao;
import com.pavan.dao.EmployeeDaoImpl;

public class InsertEmployee1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int eid = sc.nextInt();
;
		System.out.println("Enter the Employee Name:");
		String name=  sc.next();
		
		System.out.println("Enter the Employee Address:");
		String address = sc.next();
		
		System.out.println("Enter the Employee SAlary:");
		int salary = sc.nextInt();
		
		EmployeeDao emp = new EmployeeDaoImpl();
		String result = emp.insertEmployeeDetails(eid, name, address, salary);
		
		System.out.println(result);
		
	}

}
