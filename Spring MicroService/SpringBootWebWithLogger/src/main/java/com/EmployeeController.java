package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	Logger ll = LogManager.getLogger(EmployeeController.class);
	
	@GetMapping(value = "say")
	public String sayHello() {
		ll.info("This is info details");
		ll.warn("This is warning details");
		ll.error("This is error details");
		return "Welcome ";
	}
}
