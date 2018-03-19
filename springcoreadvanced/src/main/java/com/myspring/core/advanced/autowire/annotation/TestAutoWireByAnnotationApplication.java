package com.myspring.core.advanced.autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestAutoWireByAnnotationApplication {

	/**
	 * Default Constructor.
	 */
	public TestAutoWireByAnnotationApplication() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/advanced/autowire/annotation/autowire-annotation-config.xml");

		Book book = (Book) appContext.getBean("book");
		System.out.println(book);

		appContext.registerShutdownHook();
		appContext.close();
	}
}