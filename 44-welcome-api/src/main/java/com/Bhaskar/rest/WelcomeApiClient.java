package com.Bhaskar.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApiClient {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg="Welcome to Bhaskar it";
		return msg;
		}

}
