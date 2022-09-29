package com.pavan.usecases;

import java.util.Scanner;

import com.pavan.dao.EmployeeDao;
import com.pavan.dao.EmployeeDaoImpl;
import com.pavan.model.Employee3;

public class InsertEmployeeDetail2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int eid = sc.nextInt();
;
		System.out.println("Enter the Employee Name:");
		String name=  sc.next();
		
		System.out.println("Enter the Employee Address:");
		String address = sc.next();
		
//		System.out.println("Enter the Employee Salary:");
//		int salary = sc.nextInt();
		
		Employee3 employee = new Employee3();
		employee.setEid(eid);
		employee.setName(name);
		employee.setAddress(address);
//		employee.setSalary(salary);
		
		EmployeeDao emp = new EmployeeDaoImpl();
		String result = emp.insertEmployeeDetails2(employee);
		
		System.out.println(result);
	}

}
