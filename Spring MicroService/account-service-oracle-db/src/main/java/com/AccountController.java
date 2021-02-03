package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping(value = "createAccount")
	public String createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	@GetMapping(value = "update/{accno}/{amount}")
	public String updateAccount(@PathVariable("accno") int accno, @PathVariable("amount") float amount) {
		return accountService.updateAmount(accno, amount);
	}
}
