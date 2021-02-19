package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRabitMqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRabitMqProducerApplication.class, args);
		System.out.println("Producer running on port number 9090");
	}

}
