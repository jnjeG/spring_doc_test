package com.test.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	   public static void main(String[] args) {
	     
	      AbstractApplicationContext  context = new ClassPathXmlApplicationContext("allbean.xml");
	      context.registerShutdownHook();
	      
	      System.out.println("====================================");
	      System.out.println("====================================");
	      System.out.println("--------------user0����xmlԪ�������õĳ�ʼ�����������ٺ���--------------");
	      UserService userService0 = context.getBean("user0", UserService.class);
	      System.out.println("����������Ϊ: "+userService0.getUser());
	      
	      System.out.println("--------------user1����Ĭ�ϵĳ�ʼ������--------------");
	      UserService userService1 = context.getBean("user1", UserService.class);
	      System.out.println("����������Ϊ: "+userService1.getUser());
	      
	      System.out.println("--------------user2��scopeΪ prototype������ִֻ�г�ʼ����������ִ������,prototype����,ȡbeanʱ�ų�ʼ��--------------");
	      UserService userService2 = context.getBean("user2", UserService.class);
	      System.out.println("����������Ϊ: "+userService2.getUser());
	      System.out.println("TestMain ����");
	 
	      System.out.println("====================================");
	      System.out.println("====================================");
	      System.out.println("--------------account0����xmlԪ�������õĳ�ʼ�����������ٺ���--------------");
	      AccountService account0 = context.getBean("account0", AccountService.class);
	      System.out.println("����������Ϊ: "+account0.getUser());
	      
	      System.out.println("--------------account1����Ĭ�ϵĳ�ʼ������--------------");
	      AccountService account1 = context.getBean("account1", AccountService.class);
	      System.out.println("����������Ϊ: "+account1.getUser());
	      
	      System.out.println("--------------account2��scopeΪ prototype������ִֻ�г�ʼ����������ִ������,prototype����,ȡbeanʱ�ų�ʼ��--------------");
	      AccountService account2 = context.getBean("account2", AccountService.class);
	      System.out.println("����������Ϊ: "+account2.getUser());
	      System.out.println("TestMain ����");
	      
	      
	      
	      
	      
	      
	   }
	 
	}
