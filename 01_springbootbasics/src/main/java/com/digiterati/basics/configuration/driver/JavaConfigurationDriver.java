package com.digiterati.basics.configuration.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.digiterati.basics.configuration.JavaConfigurationConfig;

@SpringBootApplication
public class JavaConfigurationDriver {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JavaConfigurationConfig.class,args);
		//ctx.registerShutdownHook();
		ctx.close();
	}

}
