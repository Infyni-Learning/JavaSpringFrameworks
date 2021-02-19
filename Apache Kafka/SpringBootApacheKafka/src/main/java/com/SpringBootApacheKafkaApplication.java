package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApacheKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheKafkaApplication.class, args);
		System.out.println("Server is running on port number 9000");
	}

}
