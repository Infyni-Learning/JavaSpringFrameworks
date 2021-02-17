package com.example.SpringRestWithDocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

		@RequestMapping(value = "docker")
		public String sayHelloToDocker() {
			return "Welcome to Spring Rest with Docker";
		}
}
