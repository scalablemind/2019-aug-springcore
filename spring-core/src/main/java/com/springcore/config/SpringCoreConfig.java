package com.springcore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SpringCoreBeans.class,SpringInfraConfig.class,SpringWsConfig.class})
public class SpringCoreConfig {

}
