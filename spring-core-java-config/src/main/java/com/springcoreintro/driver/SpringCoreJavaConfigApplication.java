package com.springcoreintro.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.spring.common.dto.Account;
import com.spring.common.service.AccountService;
import com.spring.common.service.SingletonService;
import com.springcoreintro.config.SpingCoreJavaConfiguration;

@SpringBootApplication
@Import(SpingCoreJavaConfiguration.class)
public class SpringCoreJavaConfigApplication {

	public static void main(String[] args) {
		/*
		 * ApplicationContext ctx =
		 * SpringApplication.run(SpringCoreJavaConfigApplication.class, args);
		 * AccountService service = ctx.getBean(AccountService.class);
		 * service.updateAccount(new Account("123","spring core"));
		 */
		
		ApplicationContext ctx = SpringApplication.run(SpringCoreJavaConfigApplication.class, args);
		
		SingletonService service = ctx.getBean(SingletonService.class);
		service.process();
		
		service = ctx.getBean(SingletonService.class);
		service.process();
		
		
	}

}
