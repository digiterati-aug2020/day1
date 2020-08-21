package com.digiterati.basics.configuration.helper.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digiterati.basics.configuration.helper.DataSource;
import com.digiterati.basics.configuration.helper.TransferService;

//@Component
public class TransferServiceImpl implements TransferService {
	
	
	private DataSource dataSource;

	//@Autowired
	public TransferServiceImpl(DataSource dataSource) {
		super();
		System.out.println("inside transfer service impl constructor...."+dataSource);
		this.dataSource = dataSource;
	}
	
	

}
