package com.myDao.usecases;

import java.util.Arrays;
import java.util.Scanner;

import com.myDao.Dao.EmployeeDao;
import com.myDao.Dao.EmployeeDaoImpl;
import com.myDao.exceptions.EmployeeException;

public class GetNameAddress {

	public static void main(String[] args) {
		EmployeeDao emp = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the Employee Id to get name & Address :");
		int empId = sc.nextInt();
		String[]  arr = null;
		try {
			arr= emp.getNameAndAddress(empId);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
