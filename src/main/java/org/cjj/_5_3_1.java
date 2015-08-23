package org.cjj;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class _5_3_1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("org/cjj/applicationContext.xml");
//				new FileSystemXmlApplicationContext(Constant.CONFIG_LOCATION);
		A bean = (A)context.getBean("aaaa");
		bean.say();
	}
}
