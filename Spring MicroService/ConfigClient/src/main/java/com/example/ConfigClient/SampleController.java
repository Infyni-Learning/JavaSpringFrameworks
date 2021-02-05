package com.example.ConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Value("${message:Default message}")
	private String msg;
	
	@GetMapping(value = "say")
	public String getConfigInfo() {
		return msg;
	}
}
