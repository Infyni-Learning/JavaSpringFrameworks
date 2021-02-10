package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebWithLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebWithLoggerApplication.class, args);
		System.out.println("running on port number 9090");
	}

}
