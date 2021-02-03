package com;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account acc) {
		
		Account account = accountRepository.save(acc);
		if(account!=null) {
			return "Account created";
		}else {
			return "Account didn't created";
		}
	}
	
	public String updateAmount(int accno,float amount) {
		System.out.println("Client Hit this method");
	Optional<Account> acc = accountRepository.findById(accno);
	if(acc.isPresent()) {
		Account a = acc.get();
		a.setAmount(a.getAmount()+amount);
		
		accountRepository.saveAndFlush(a);
		return "Amount Deposited successfully";
	}else {
		return "Account not present";
	}
	}
}
