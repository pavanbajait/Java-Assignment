package com.pbajait.usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.pbajait.model.Address;
import com.pbajait.model.Emploee;
import com.pbajait.utility.DBUtil;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many EMployee details you want to add :");
		int n = sc.nextInt();
		int count = 1;
		for(int i=0; i<n ; i++) {
			
			EntityManager em= DBUtil.provideEntityManager();
			System.out.println("Enter the details of Employee :"+count++);
			System.out.println("Enter the name :");
			String name = sc.next();
			System.out.println("Enter the Gender :");
			String gen = sc.next();
			System.out.println("Enter the salary :");
			int salary = sc.nextInt();
			
			Emploee empl = new Emploee();
			empl.setName(name);
			empl.setGender(gen);
			empl.setSalary(salary);
			
			System.out.println("How many address you want to add:");
			int num = sc.nextInt();
			int add = 1;
			for(int j=0;j<num;j++) {
				System.out.println("Enter the "+add++ +" address details:");
				
				System.out.println("Enter the state :");
				String state = sc.next();
				System.out.println("Enter the city :");
				String city = sc.next();
				System.out.println("Enter the pincode :");
				String pin = sc.next();
				System.out.println("Enter the address type :");
				String type = sc.next();
				
				empl.getEmpAddress().add(new Address(state, city, pin, type));	
				
			}
						
			em.getTransaction().begin();
			
			em.persist(empl);
			
			em.getTransaction().commit();;
			
			em.close();
			
			
		}

		System.out.println("done...");
		
		
	}

}
