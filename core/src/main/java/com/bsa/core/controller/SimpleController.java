package com.bsa.core.controller;

import org.springframework.stereotype.Controller;

import com.bsa.core.service.GreetingService;

@Controller
public class SimpleController {
    
	private GreetingService greetingService;
	
	public SimpleController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


	public String hello() {
		System.out.println("hello");
		return greetingService.sayGreeting();
	}
}
