package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("noauth")
public class NoAuthController {

	@GetMapping(value = "say")
	public String sayHello() {
		
		return "Welcome no authentication required";
	}
}
