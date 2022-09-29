package com.evaluation.usecases;

import java.util.Scanner;

import com.evaluation.dao.Account;
import com.evaluation.dao.AccountDao;
import com.evaluation.dao.AccountDaoImpl;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AccountDao dao = new AccountDaoImpl();
		
		System.out.println("Do You Want get account details from account table(y/n)");
		String ans1 = sc.next();
		if(ans1.equalsIgnoreCase("y")) {
			System.out.println("ENter the accountholder id to find the account holder details:");
			int id = sc.nextInt();
			
			Account acnt = dao.findById(id);
			
			System.out.println(acnt);
		}
		
		System.out.println("Do You Want Insert Account Details in Accoiunt table(y/n)");
		String ans2 = sc.next();
		if(ans2.equalsIgnoreCase("y")) {
			System.out.println("ENter the accntholder id:");
			int id = sc.nextInt();
			System.out.println("ENter the accntholder email:");
			String email = sc.next();
			System.out.println("ENter the accntholder address:");
			String address = sc.next();
			System.out.println("ENter the accntholder balance:");
			double balance = sc.nextDouble();
			
			Account accnt = new Account(id, email, address, balance);
			System.out.println(dao.save(accnt));
		}
		
	}
}
