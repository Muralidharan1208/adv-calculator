package com.adv.calculator.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Multiplication {
	
	@GetMapping("/multiply")
	public int multiply() {
		
		int i = 10;
		int j = 20;
		
		int c = i*j;
		
		return c ;
	}

}
