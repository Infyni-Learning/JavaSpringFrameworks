package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients					// enable feign client features
public class PaytmServiceUsingFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmServiceUsingFeignClientApplication.class, args);
		System.err.println("Server running on port number 9494");
	}

}
