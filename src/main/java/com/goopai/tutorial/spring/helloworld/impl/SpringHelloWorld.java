package com.goopai.tutorial.spring.helloworld.impl;

import com.goopai.tutorial.spring.helloword.HelloWorld;

public class SpringHelloWorld implements HelloWorld {

	@Override
	public void sayHello() {
        System.out.println("Spring Say Hello!!");
	}
}
