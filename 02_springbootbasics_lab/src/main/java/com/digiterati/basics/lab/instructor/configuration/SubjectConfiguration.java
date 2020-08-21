package com.digiterati.basics.lab.instructor.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.digiterati.basics.lab.instructor.controller","com.digiterati.basics.lab.instructor.repository"})
public class SubjectConfiguration {

	
}
