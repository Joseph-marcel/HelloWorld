package com.openclassrooms.helloworld.model;

import org.springframework.stereotype.Component;

@Component
public class BusinessService {

	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw;
	}
}
