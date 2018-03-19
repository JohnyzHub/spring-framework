package com.myspring.core.springcore.i18n.bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestLanguageProperties {

	/**
	 * Default Constructor.
	 */
	public TestLanguageProperties() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/i18n/bean/language-config.xml");

		Welcome welcome = (Welcome) appContext.getBean("welcome");
		System.out.println(welcome);

		appContext.registerShutdownHook();
		appContext.close();
	}
}