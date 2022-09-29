package com.pbajait.usecases;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.pbajait.model.Address;
import com.pbajait.model.Customer;
//import com.pbajait.model.Emploee;
import com.pbajait.utility.EMUtil;

public class Main {
	
//	Problem 2 solution :

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Customer cus1 = new Customer();
		cus1.setName("Pavan");
		cus1.setMobileNumber("9561471782");
		cus1.setEmail("pbajait@gmail.com");
		
		cus1.getAddresses().add(new Address("MH", "442301", "Hgt", "Home"));
		cus1.getAddresses().add(new Address("MH", "440001", "Ngp", "Office"));
		
		
		Customer cus2 = new Customer();
		cus2.setName("Shubham");
		cus2.setMobileNumber("9856241351");
		cus2.setEmail("sughade@gmail.com");
	
		cus2.getAddresses().add(new Address("MH", "444501", "Ashti", "Home"));
		cus2.getAddresses().add(new Address("MH", "446501", "Arvi", "Office"));
		
		em.getTransaction().begin();
		
		em.persist(cus1);
		em.persist(cus2);
		
		em.getTransaction().commit();;
		
		em.close();
		
		System.out.println("Customer details inserted successfully...");
		
		System.out.println("Enter the customer Id to get the address of customer :");
		int cid = sc.nextInt();
		
		String jpql = "from Customer where cid = ?1";
		
		Query q = em.createQuery(jpql);
		
		q.setParameter(1, cid);
		
		Object obj= q.getSingleResult();
		
		Customer cust = (Customer)obj;
		
		List<Address> addr = cust.getAddresses();
				
		System.out.println("Address of customer :");
		
		for(Address add : addr)
			System.out.println(add);
			
		
		
	}

}
