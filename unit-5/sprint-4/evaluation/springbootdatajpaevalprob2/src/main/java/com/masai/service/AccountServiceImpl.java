package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.repository.AccountDao;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDao dao;
	

	@Override
	public Account openAccount(Account acc) {
		
		Account savedStudent= dao.save(acc);
		
		return savedStudent;
	}


	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		Account existingAccount= dao.findById(accno).orElseThrow(() -> new AccountException("Account does not exist with acc no "+accno));;
		
		dao.delete(existingAccount);
		
		
		return existingAccount;
	}



	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		Optional<Account> opt= dao.findById(accno);
		
		if(opt.isPresent()) {
			
			Account existingAccount= opt.get();
			
			
			existingAccount.setBalance(existingAccount.getBalance()+amount);
			
			return dao.save(existingAccount);
			
			
		}else
			throw new AccountException("Account does not exist with accno :"+accno);
		
	}


	@Override
	public Account withdrawAmmount(int accno, Integer amount) throws AccountException, InsufficientFundException {
		Optional<Account> opt= dao.findById(accno);
		
		if(opt.isPresent()) {
			
			Account existingAccount= opt.get();
			
			if(existingAccount.getBalance()>=amount) {
				existingAccount.setBalance(existingAccount.getBalance()+amount);
				
				return dao.save(existingAccount);
				
			}else {
				
				throw new InsufficientFundException("Insufficiant fund in account no "+accno);
				
			}
			
		}else
			throw new AccountException("Account does not exist with accno :"+accno);
	}

	
}
