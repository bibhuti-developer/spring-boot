package com.bsa.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bsa.core.controller.SimpleController;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(CoreApplication.class, args);
		SimpleController sc = (SimpleController) cxt.getBean("simpleController");
		sc.hello();
	}
}
