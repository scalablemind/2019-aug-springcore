package com.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCoreBeans {
	
	@Bean
	public String createNameBean() {
		return "Spring Core";
	}

}
