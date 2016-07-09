package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hello.HelloWorld;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		HelloWorld obj = (HelloWorld)context.getBean("helloworld");

		obj.print();
	}

}
