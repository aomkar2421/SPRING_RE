package com.om.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.om.javaconfig")
class Config {
	
	// in case of multiple beans, bean with same name as instance has highest priority and if bean defined as primary has highest priority in any case
	
//	@Bean
//	@Primary
//	public Address getAddress() {
//		return new Address("first");
//	}
	
	@Bean
	public Address add() {
		return new Address("second");
	}
	
	@Bean
	public Emp getEmp() {
		return new Emp("omkar", 1651, add());
	}

}
