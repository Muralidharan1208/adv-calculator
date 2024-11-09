package com.adv.calculator.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/welcome")
	public String sayHello() {
		
		return "Hello world" ;
	}

}
