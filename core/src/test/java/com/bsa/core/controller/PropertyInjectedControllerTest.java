package com.bsa.core.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bsa.core.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	private PropertyInjectedController propertyInjectedController; 
	
	@Before
	public void init() {
		this.propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.greetingService.sayGreeting());
	}
}
