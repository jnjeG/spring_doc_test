package com.test.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	   public static void main(String[] args) {
	     
	      AbstractApplicationContext  context = new ClassPathXmlApplicationContext("allbean.xml");
	      context.registerShutdownHook();
	      
	      System.out.println("====================================");
	      System.out.println("====================================");
	      System.out.println("--------------user0采用xml元数据配置的初始化函数和销毁函数--------------");
	      UserService userService0 = context.getBean("user0", UserService.class);
	      System.out.println("依赖的属性为: "+userService0.getUser());
	      
	      System.out.println("--------------user1采用默认的初始化函数--------------");
	      UserService userService1 = context.getBean("user1", UserService.class);
	      System.out.println("依赖的属性为: "+userService1.getUser());
	      
	      System.out.println("--------------user2的scope为 prototype，测试只执行初始化函数，不执行析构,prototype类型,取bean时才初始化--------------");
	      UserService userService2 = context.getBean("user2", UserService.class);
	      System.out.println("依赖的属性为: "+userService2.getUser());
	      System.out.println("TestMain 结束");
	 
	      System.out.println("====================================");
	      System.out.println("====================================");
	      System.out.println("--------------account0采用xml元数据配置的初始化函数和销毁函数--------------");
	      AccountService account0 = context.getBean("account0", AccountService.class);
	      System.out.println("依赖的属性为: "+account0.getUser());
	      
	      System.out.println("--------------account1采用默认的初始化函数--------------");
	      AccountService account1 = context.getBean("account1", AccountService.class);
	      System.out.println("依赖的属性为: "+account1.getUser());
	      
	      System.out.println("--------------account2的scope为 prototype，测试只执行初始化函数，不执行析构,prototype类型,取bean时才初始化--------------");
	      AccountService account2 = context.getBean("account2", AccountService.class);
	      System.out.println("依赖的属性为: "+account2.getUser());
	      System.out.println("TestMain 结束");
	      
	      
	      
	      
	      
	      
	   }
	 
	}
