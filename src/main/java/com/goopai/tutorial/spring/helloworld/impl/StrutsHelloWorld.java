package com.goopai.tutorial.spring.helloworld.impl;

import com.goopai.tutorial.spring.helloword.HelloWorld;

public class StrutsHelloWorld implements HelloWorld {

	@Override
	public void sayHello() {
        System.out.println("Struts Say Hello!!");
	}
}
