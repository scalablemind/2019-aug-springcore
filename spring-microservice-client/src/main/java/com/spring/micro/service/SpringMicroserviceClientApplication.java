package com.spring.micro.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.spring.micro.service.client.config.SpringMicroServiceConfig;

@SpringBootApplication
@Import(SpringMicroServiceConfig.class)
@EnableDiscoveryClient
public class SpringMicroserviceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceClientApplication.class, args);
	}

}
