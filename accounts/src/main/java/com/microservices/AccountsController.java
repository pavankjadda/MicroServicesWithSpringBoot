package com.microservices;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController
{
	private Logger logger = Logger.getLogger(AccountsController.class.getName());
	
	private final AccountRepository accountRepository;

	@Autowired
	public AccountsController(AccountRepository accountRepository)
	{
		this.accountRepository = accountRepository;
	}


	@RequestMapping("/accounts/{accountNumber}")
	@ResponseBody
	public Account byNumber(@PathVariable("accountNumber") Long  accountNumber)
	{
		Account account=accountRepository.findAccountByNumber(accountNumber);
		logger.info("accounts-service byNumber() found: " + account);
		return account;
	}
	
	@RequestMapping("/accounts/owner/{name}")
	@ResponseBody
	public List<Account> byOwner(@PathVariable("name") String name)
	{
		List<Account> accounts=accountRepository.findAccountByOwner(name);
		logger.info("accounts-service byOwner() found: " + accounts);
		return accounts;
	}
}
