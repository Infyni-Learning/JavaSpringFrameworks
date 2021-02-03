package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountServiceOracleDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceOracleDbApplication.class, args);
		System.err.println("Server running on port number 9292");
	}

}
