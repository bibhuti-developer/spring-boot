package com.bsa.core.controller;

import org.springframework.stereotype.Controller;

import com.bsa.core.service.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
