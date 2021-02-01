package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "emp")
public class EmployeeController {

	
	@GetMapping(value = "sayHello")
	public String helloEmployee() {
		
		return "Welcome to Simple Rest Client with Eureka Client";
	}
}
