package com.springcore;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class TestConfig {
	
	@Bean
	public DataSource createDataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		builder.addScript("create.sql");
		builder.setType(EmbeddedDatabaseType.HSQL);
		return builder.build();
	}
	
	
	@Bean
	public JdbcTemplate createTemplate() {
		return new JdbcTemplate(createDataSource());
	}

}
