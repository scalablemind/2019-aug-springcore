package com.spring.micro.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.spring.micro.service.config.SpringMicroServiceConfig;

@SpringBootApplication
@Import(SpringMicroServiceConfig.class)
public class SpringMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceApplication.class, args);
	}

}
