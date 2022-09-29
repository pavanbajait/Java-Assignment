package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountservice;

	@PostMapping("/accounts")
	public ResponseEntity<Account> openAccountHAndler(@RequestBody Account acc){
		Account openaccount= accountservice.openAccount(acc);
		
		return new ResponseEntity<Account>(openaccount, HttpStatus.CREATED);
		
	}
	

	@DeleteMapping("/accounts/{accno}")
	public ResponseEntity<Account> closeAccountHandler(@PathVariable("accno") Integer accno) throws AccountException{
		
		Account account= accountservice.closeAccount(accno);
		
		return new ResponseEntity<Account>(account,HttpStatus.OK);
		
	}
	
	@PutMapping("/depositamount/{accno}")
	public ResponseEntity<Account> depositAmountHandler(@PathVariable("accno") Integer accno, @RequestParam("amount") Integer amount) throws AccountException{
		
		Account updatedAccount= accountservice.depositAmount(accno, amount);
		
		return new ResponseEntity<Account>(updatedAccount,HttpStatus.OK);
		
	}
	
	@PutMapping("/withdrawamount/{accno}")
	public ResponseEntity<Account> withdrawAmountHandler(@PathVariable("accno") Integer accno, @RequestParam("amount") Integer amount) throws AccountException, InsufficientFundException{
		
		Account updatedAccount= accountservice.depositAmount(accno, amount);
		
		return new ResponseEntity<Account>(updatedAccount,HttpStatus.OK);
		
	}
	
	
	
}
