package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "auth")
@RestController
public class AuthController {

	@GetMapping(value = "user")
	public String userInfo() {
		
		return "Welcome to User Rest Page";
	}
	
	@GetMapping(value = "admin")
	public String adminInfo() {
		
		return "Welcome to Admin Rest Page";
	}
}
