package com.bsa.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bsa.core.controller.ConstructorInjectedController;
import com.bsa.core.controller.PropertyInjectedController;
import com.bsa.core.controller.SetterInjectedController;
import com.bsa.core.controller.SimpleController;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(CoreApplication.class, args);
		SimpleController sc = (SimpleController) cxt.getBean("simpleController");
		sc.hello();
		
		System.out.println(cxt.getBean(PropertyInjectedController.class).greetingService.sayGreeting());
		System.out.println(cxt.getBean(SetterInjectedController.class).sayHello());
		System.out.println(cxt.getBean(ConstructorInjectedController.class).sayHello());
	}
}
