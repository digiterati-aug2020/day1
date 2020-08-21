package com.digiterati.basics.rest.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.digiterati.basics.rest.configuration.RestConfiguration;

@SpringBootApplication(scanBasePackageClasses = RestConfiguration.class)
public class RestDriver extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(RestDriver.class,args);
	}
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(RestDriver.class);
	    }

}
