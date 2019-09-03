package com.spring.jdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.common.dto.Account;
import com.spring.jdbc.config.SpringJdbcConfig;

@SpringBootApplication
@Import(SpringJdbcConfig.class)
public class SpringJdbcApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);
		JdbcTemplate template = ctx.getBean(JdbcTemplate.class);
		
		template.update("insert into account(id,name) values('1001','David')");
		
		Long count = template.queryForObject("select count(1) from account where name='David'",Long.class);
		System.out.println("Count of records in table="+count);
		
		
		RowMapper<Account> mapper = (rs,cnt) -> new Account(rs.getString("id"),rs.getString("name"));
		List<Account> accounts = template.query("select id,name from account",mapper);
		accounts.forEach(a->System.out.println(a));
		
		
		//deleting the records
		template.update("delete from account where name=?",new Object[] {"David"});
		count = template.queryForObject("select count(1) from account where name='David'",Long.class);
		System.out.println("Count of records in table="+count);
	}
	
	

}
