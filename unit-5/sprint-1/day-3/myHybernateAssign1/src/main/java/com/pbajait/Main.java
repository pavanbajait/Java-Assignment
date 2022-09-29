package com.pbajait;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pbajait.daoInterface.EmployeeDAO;
import com.pbajait.daoInterface.EmployeeDaoImpl;

public class Main {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDaoImpl();
		
		System.out.println("Do You Want Insert Employee Details in Employee table(y/n)");
		String ans1 = sc.next();
		if(ans1.equalsIgnoreCase("y")) {
			System.out.println("ENter the employee id:");
			int empId = sc.nextInt();
			System.out.println("ENter the employee name:");
			String name = sc.next();
			System.out.println("ENter the employee address:");
			String address = sc.next();
			System.out.println("ENter the employee salary:");
			int salary = sc.nextInt();
			
			Employee empObj = new Employee(empId, name, address, salary);
			dao.save(empObj);
		}
		
		System.out.println("Do you want get address of particular Employee(y/n)");
		String ans2 = sc.next();
		if(ans2.equalsIgnoreCase("y")) {
			System.out.println("Enter the Employee Id to get Address of Employee: ");
			int empId = sc.nextInt();
			System.out.println(dao.getAddressOfEmployee(empId));
		}
		
		System.out.println("Do you want add bonus to particular Employee(y/n)");
		String ans3 = sc.next();
		if(ans3.equalsIgnoreCase("y")) {
			System.out.println("Enter the Employee Id to add the bonus in salary: ");
			int empId = sc.nextInt();
			System.out.println("Enter the bonus:");
			int bonus = sc.nextInt();
			
			System.out.println(dao.giveBonusToEmployee(empId,bonus));
		}
		
		System.out.println("Do you want Delete particular Employee(y/n)");
		String ans4 = sc.next();
		if(ans4.equalsIgnoreCase("y")) {
			System.out.println("Enter the Employee Id to delete the record from the employee table: ");
			int empId = sc.nextInt();
			if(dao.deleteEmployee(empId))
				System.out.println("Record Deleted..");
			else
				System.out.println("Employee Does not exist");
		}
			System.out.println("Java Application executed Successfully");
	}
	
}
