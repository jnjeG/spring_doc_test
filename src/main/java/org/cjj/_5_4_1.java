package org.cjj;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import examples.ExampleBean;
public class _5_4_1 {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = 
				new FileSystemXmlApplicationContext(Constant.CONFIG_LOCATION);
		ExampleBean  bean = (ExampleBean )context.getBean("exampleBean");
		System.out.println();
	}
}
