package com.bsa.core.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bsa.core.service.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	private ConstructorInjectedController constructorInjectedController; 
	
	@Before
	public void init() {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
	}
}
