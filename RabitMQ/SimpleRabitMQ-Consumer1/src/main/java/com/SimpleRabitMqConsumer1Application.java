package com;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRabitMqConsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRabitMqConsumer1Application.class, args);
		System.out.println("Running on port number 9292");
	}

	

	@RabbitListener(queues = "My_Queue1")
	    public void receiveMessage(String message) {
	    System.out.println("Received Message for Second client:" + message);
	    System.out.println();
	  }
}
