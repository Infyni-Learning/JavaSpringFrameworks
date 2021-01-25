package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value = "hello")
	public String sayHello() {
		return "Welcome to Spring rest using Spring boot";
	}
}
