package com.spring.xml.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.spring.common.service.AccountService;

@SpringBootApplication
@ImportResource("classpath*:/com/applicationContext.xml")
public class SpringCoreXmlConfigApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCoreXmlConfigApplication.class, args);
		AccountService accountService = ctx.getBean(AccountService.class);
		accountService.deleteAccount("123");
	}

}
