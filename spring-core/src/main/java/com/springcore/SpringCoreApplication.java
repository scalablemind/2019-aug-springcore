package com.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springcore.config.SpringCoreConfig;

@SpringBootApplication
@Import(SpringCoreConfig.class)
public class SpringCoreApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		String str1 = (String) ctx.getBean("addressString");
		String str2 = ctx.getBean("addressString", String.class);
		System.out.println(str1 == str2);
		
		//FileSystemXmlApplicationContext
		
		//ctx = new AnnotationConfigApplicationContext(SpringCoreConfig.class); 
		//str2 = ctx.getBean("createNameBean", String.class);
		//System.out.println(str2);
		

		//ctx = SpringApplication.run(SpringCoreApplication.class, args);
		/*
		 * String nameStr = ctx.getBean(String.class); System.out.println(nameStr);
		 */
	}

}
