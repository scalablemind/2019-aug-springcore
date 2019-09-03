package com.spring.micro.service.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SpringBootNamingServer.class)
public class SpringMicroServiceConfig {

}
