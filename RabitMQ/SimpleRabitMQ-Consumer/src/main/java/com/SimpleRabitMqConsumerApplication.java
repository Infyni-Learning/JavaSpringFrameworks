package com;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRabitMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRabitMqConsumerApplication.class, args);
		System.out.println("First Consumer running on port number 9191");
	}

	@RabbitListener(queues = "My_Queue")		// This listen listen the message 
	    public void receiveMessage(String message) {
	    System.out.println("Received Message for Rabit MQ:" + message);
	    System.out.println();
	  }
}
