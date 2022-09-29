package com.myDao.usecases;

import java.util.Scanner;

import com.myDao.Dao.EmployeeDao;
import com.myDao.Dao.EmployeeDaoImpl;

public class GiveBonusToEmpl {
	
	public static void main(String[] args) {
		EmployeeDao emp = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the Employee Id to update bonus :");
		int empId = sc.nextInt();
		System.out.println("Enter the bonus :");
		int bonus = sc.nextInt();
		String result = emp.giveBonusToEmployee(empId, bonus);
		
		System.out.println(result);
	}

}
