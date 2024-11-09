package com.adv.calculator.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
	@GetMapping("/add")
	public int add() {
		int a = 10;
		int b = 20;
		
		int c = a + b;
		System.out.println("hi");
		
		return c ;
	}

}
