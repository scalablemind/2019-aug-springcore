package com.spring.common.service.impl;

import com.spring.common.dto.Account;
import com.spring.common.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	@Override
	public void updateAccount(Account account) {
		
		System.out.println("Inside update account service...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account getAccount() {
		System.out.println("Inside get account service...");

		return new Account("123","spring core");
	}

	@Override
	public void deleteAccount(String accountNumber) {
		System.out.println("Inside delete account service...");
		
	}

}
