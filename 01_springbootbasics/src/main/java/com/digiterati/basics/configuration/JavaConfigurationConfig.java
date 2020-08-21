package com.digiterati.basics.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.digiterati.basics.configuration.helper.AccountRepository;
import com.digiterati.basics.configuration.helper.DataSource;
import com.digiterati.basics.configuration.helper.TransferService;
import com.digiterati.basics.configuration.helper.impl.BasicDataSource;
import com.digiterati.basics.configuration.helper.impl.JdbcAccountRepository;
import com.digiterati.basics.configuration.helper.impl.TransferServiceImpl;

@Configuration
public class JavaConfigurationConfig {
	
	@Bean
	public TransferService transferBean() {
		return new TransferServiceImpl(dataSource());
	}
	
	@Bean
	public AccountRepository accountRepository() {
		return new JdbcAccountRepository(dataSource());
	}
	
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl("Test URL");
		basicDataSource.setPassword("Test Password");
		basicDataSource.setDriverClassName("Test Driver Class");
		basicDataSource.setUsername("Test Username");
		return basicDataSource;
	}

}
