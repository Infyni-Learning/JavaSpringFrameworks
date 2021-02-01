package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "say")
public class SimpleController {

	@GetMapping(value = "msg")
	public String sayHello() {
		return "Welcome to Spring boot rest";
	}
}
