package com.myDao.usecases;

import java.util.Scanner;

import com.myDao.Dao.EmployeeDao;
import com.myDao.Dao.EmployeeDaoImpl;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println("ENter the Employee Id to update bonus :");
		EmployeeDao emp = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the Employee Id to delete record of employee :");
		int empId = sc.nextInt();
		
		boolean result = emp.deleteEmployee(empId);
		
		if(result)
			System.out.println("Record of Emplee deleted successfully...");
		else
			System.out.println("Employee does not exist");
	}

}
