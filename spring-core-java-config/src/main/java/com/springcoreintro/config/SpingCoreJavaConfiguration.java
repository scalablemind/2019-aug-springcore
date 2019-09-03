package com.springcoreintro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.common.config.SpringCommonConfig;

@Configuration
@Import(SpringCommonConfig.class)
public class SpingCoreJavaConfiguration {
	
}
