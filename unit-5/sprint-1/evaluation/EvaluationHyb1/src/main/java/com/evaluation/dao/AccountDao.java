package com.evaluation.dao;

public interface AccountDao {
	
	public Account findById(int id);
	public String save(Account account);
	public String update(Account account);
	public String remove(int id);
	public String withdraw(double amount,int accountId);
	public String deposit(double amount,int accountId)	;
}
