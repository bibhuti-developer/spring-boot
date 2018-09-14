package com.bsa.core.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.bsa.core.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;
	
	//@Autowired // default 
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
