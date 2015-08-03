package org.cjj;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class _5_3_1 {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = 
				new FileSystemXmlApplicationContext(Constant.CONFIG_LOCATION);
		A bean = (A)context.getBean("aaaa");
		bean.say();
	}
}
