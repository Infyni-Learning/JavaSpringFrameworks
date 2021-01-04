package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDetails {

	
	@Bean(name = "employee")
	public Employee getEmployeeBean() {
		Employee emp = new Employee();
		return emp;
	}


	@Bean(name="address")
	public Address getAddressBean() {
		Address add= new Address();
		System.out.println("Address object created...");
		return add;
	}
}
