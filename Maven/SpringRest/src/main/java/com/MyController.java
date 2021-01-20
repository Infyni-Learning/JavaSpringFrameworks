package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController		// @Controller + @ResposeBody
public class MyController {

	@RequestMapping(value = "say",produces = MediaType.TEXT_PLAIN_VALUE)
	public  String sayHello() {
		return "Welcome to Spring MVC With Rest";
	}
}
