package com.spring.jdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class SpringJdbcConfig {
	
	@Bean(name="datasource")
	public DataSource createDataSource() {
		EmbeddedDatabase datasource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("create.sql").addScript("insert.sql")
				.build();
		return datasource;
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate createTemplate() {
		return new JdbcTemplate(createDataSource());
	}

}
