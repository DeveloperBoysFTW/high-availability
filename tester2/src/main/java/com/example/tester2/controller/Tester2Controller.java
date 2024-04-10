package com.example.tester2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tester2")
public class Tester2Controller {

	 @Autowired
	   private Environment environment;
	
	@GetMapping("/api") 
	public String getTestingApi() {
		System.out.println();
		return " this is from TESTER2222 Server Port: " + environment.getProperty("server.port");
	}
}
