package com.pbajait.usecases;

import java.util.Scanner;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Employee;

public class UpdateEmplSalay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDaoImpl();
		System.out.println("Enter the employee Id to update the record:");
		int empId = sc.nextInt();
		Employee empl;
		try {
			empl = dao.getEmployeeById(empId) ;
			if(empl!=null) {
				System.out.println("Enter the new Employee Salary:");
				int slry = sc.nextInt();
				
				empl.setSalary(slry);
				
				Employee e;
				
					try {
						e = dao.updateEmployee(empl);
						System.out.println("Details of Updated Employee "+e.getEmpId()+e);
					} catch (EmployeeException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}else {
				System.out.println("Employee does not exist...");
			}
				
		} catch (EmployeeException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
			
		
	}
}
