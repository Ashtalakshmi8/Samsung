package com.xworkz.samsung.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class DBConfiguration {

	public DBConfiguration() {
		System.out.println("started DB Configuration");
	}

	@Bean
	public LocalEntityManagerFactoryBean localEntityManagerFactory() {
		System.out.println("Running Local entity manager factory bean");
		LocalEntityManagerFactoryBean managerFactoryBean = new LocalEntityManagerFactoryBean();
		managerFactoryBean.setPersistenceUnitName(null);
		return managerFactoryBean;

	}
}