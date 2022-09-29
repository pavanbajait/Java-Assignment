package com.pavan.usecases;

import java.util.Scanner;

import com.pavan.dao.EmployeeDao;
import com.pavan.dao.EmployeeDaoImpl;
import com.pavan.exceptions.Employee3Exception;
import com.pavan.model.Employee3;

public class GetEmployeeDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int eid = sc.nextInt();
		
		EmployeeDao emp = new EmployeeDaoImpl();
		
		try {
			Employee3 employee = emp.getEmployeeDetailsByEid(eid);
			System.out.println(employee);
		} catch (Employee3Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
