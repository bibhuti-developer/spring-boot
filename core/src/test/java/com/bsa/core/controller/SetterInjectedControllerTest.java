package com.bsa.core.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bsa.core.service.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	private SetterInjectedController setterInjectedController; 
	
	@Before
	public void init() {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
	}
}
