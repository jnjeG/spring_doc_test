package org.cjj;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class _6_7_1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
//				new ClassPathXmlApplicationContext("applicationContext.xml",Constant.class);
//				new ClassPathXmlApplicationContext("applicationContext.xml",org.Constant2.class);
				new ClassPathXmlApplicationContext("cjj/applicationContext.xml",org.Constant2.class);
//				new FileSystemXmlApplicationContext(Constant.CONFIG_LOCATION);
		A bean = (A)context.getBean("aaaa");
		bean.say();
	}
}
