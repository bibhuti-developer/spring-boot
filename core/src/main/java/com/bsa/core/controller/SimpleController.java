package com.bsa.core.controller;

import org.springframework.stereotype.Controller;

@Controller
public class SimpleController {
	
	public String hello() {
		System.out.println("hello");
		return "foo";
	}
}
