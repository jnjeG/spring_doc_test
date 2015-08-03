package org.cjj;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _5_3 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
	}
}
