package com.digiterati.basics.configuration.helper.impl;

import com.digiterati.basics.configuration.helper.AccountRepository;
import com.digiterati.basics.configuration.helper.DataSource;

//@Component
public class JdbcAccountRepository implements AccountRepository {
	
	private DataSource dataSource;

	//@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		super();
		System.out.println("inside jdbc account repository constructor...."+dataSource);
		this.dataSource = dataSource;
	}
	
	
	@Override
	public Integer getAccountId(String username) {
		return 10001;
	}

}
