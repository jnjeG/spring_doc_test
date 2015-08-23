package com.test.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	   public static void main(String[] args) {
	     
	      AbstractApplicationContext  context = new ClassPathXmlApplicationContext("allbean.xml");
	      context.registerShutdownHook();
	 
	      UserService userService0 = context.getBean("user0", UserService.class);
	      System.out.println(userService0.getUser());
	      System.out.println("--------------user1����Ĭ�ϵĳ�ʼ������--------------");
	//
	      UserService userService1 = context.getBean("user1", UserService.class);
	//
	      System.out.println(userService1.getUser());
	//   
	      UserService userService2 = context.getBean("user2", UserService.class);
	//
	      System.out.println(userService2.getUser());
	  
	 
	 
	   }
	 
	}
