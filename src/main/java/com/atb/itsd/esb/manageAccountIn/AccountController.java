package com.atb.itsd.esb.manageAccountIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;
	@RequestMapping("/account/{accountNumber}")
	public String readAccountBalance(@PathVariable String accountNumber) {
		return accountService.readAccountBalance(accountNumber);
	}
}
