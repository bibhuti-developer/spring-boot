package com.bsa.core.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
	public static final String HELLO = "Hello Developer!!"; 
	@Override
	public String sayGreeting() {
		return HELLO;
	}

}
