package com.microservices;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController
{
	protected Logger logger = Logger.getLogger(AccountsController.class.getName());
	
	@Autowired
	protected AccountRepository accountRepository;
	
	public Account byNumber(@PathVariable("accountNumber") String  accountNumber)
	{
		Account account=accountRepository.findByNumber(accountNumber);
		logger.info("accounts-service byNumber() found: " + account);
		
		return account;
	}
	
	
	public List<Account> byOwner(@PathVariable("name") String name)
	{
		List<Account> accounts=accountRepository.findByOwnerContainingIgnoreCase(name);
		logger.info("accounts-service byOwner() found: " + accounts);
		
		return accounts;
	}
}
