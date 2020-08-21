package com.digiterati.basics.configuration.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.digiterati.basics.configuration.AnnotationBasedConfig;

@SpringBootApplication
public class AnnotationConfigurationDriver {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AnnotationBasedConfig.class,args);
		ctx.close();
	}

}
