package com.pbajait.usecases;

import java.util.Scanner;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Department;
import com.pbajait.model.DepartmentException;
import com.pbajait.model.EmployeeException;

public class GetDepartmentDetailsByEmployeeId {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        EmployeeDao dao = new EmployeeDaoImpl();
	        System.out.println("Enter the Employee id: ");
	        int empId = sc.nextInt();
	        
	        try {
	        	Department dept=dao.getDepartmentDetailsByEmployeeId(empId);
				 System.out.println();
			} catch (DepartmentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
	            sc.close();
	        }
	    }
}
