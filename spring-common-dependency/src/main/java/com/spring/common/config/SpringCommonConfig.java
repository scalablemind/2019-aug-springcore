package com.spring.common.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.spring.common.service.AccountService;
import com.spring.common.service.PrototypeService;
import com.spring.common.service.SingletonService;
import com.spring.common.service.impl.AccountServiceImpl;
import com.spring.common.service.impl.PrototypeServiceImpl;
import com.spring.common.service.impl.SingletonServiceImpl;

@SpringBootConfiguration
public class SpringCommonConfig {
	
	@Bean(name="accountService")
	public AccountService createAccountService() {
		return new AccountServiceImpl();
	}
	
	@Bean(name="singletonService")
	public SingletonService createSingletonService() {
		return new SingletonServiceImpl();
	}
	
	
	@Bean(name="prototypeService")
	@Scope(value="prototype",proxyMode=ScopedProxyMode.INTERFACES)
	public PrototypeService createPrototypeService() {
		return new PrototypeServiceImpl();
	}

}
