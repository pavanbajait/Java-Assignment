package com.evaluation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountDaoImpl implements AccountDao{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AccountUnit");

	public Account findById(int id) {
		
		Account acc = null;
		
		EntityManager em = emf.createEntityManager();
		
		acc = em.find(Account.class, id);
		em.close();
		if(acc != null) {
//			em.close();
			return acc;
		}
		
		return acc;
	}

	public String save(Account account) {
		EntityManager em = emf.createEntityManager();
		
		int id = account.getId();
		String email = account.getEmail();
		String address = account.getAddress();
		double balance = account.getBalance();
		
		Account acc = new Account(id, email, address, balance);
		
		em.getTransaction().begin();
		
		em.persist(acc);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Account Inserted Suuceesfully";
	}

	public String update(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	public String remove(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String withdraw(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
