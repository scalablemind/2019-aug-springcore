package com.spring.common.service;

import com.spring.common.dto.Account;

public interface AccountService {
	
	
	public void updateAccount(Account account);
	
	public Account getAccount();
	
	public void deleteAccount(String accountNumber);

}
