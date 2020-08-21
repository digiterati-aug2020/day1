package com.digiterati.basics.configuration.helper.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.digiterati.basics.configuration.JavaConfigurationConfig;
import com.digiterati.basics.configuration.helper.AccountRepository;

@SpringBootTest(classes = JavaConfigurationConfig.class)
@RunWith(SpringRunner.class)
public class TransferServiceImplTest {
	
	@Autowired
	private AccountRepository repository;
	
	@Test
	public void testGetAccountId_with_proper_value() {
		Integer num = repository.getAccountId("test");
		Assert.assertTrue(num!=null);
		Assert.assertTrue(num.equals(10001));
	}

}
