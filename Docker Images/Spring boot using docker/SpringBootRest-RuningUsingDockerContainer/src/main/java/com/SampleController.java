package com;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	
	@RequestMapping(value = "welcome/{name}")
	public String sayHello(@PathVariable("name") String name) {
			return "Welcome user from Docker container"+name;
	}
}
