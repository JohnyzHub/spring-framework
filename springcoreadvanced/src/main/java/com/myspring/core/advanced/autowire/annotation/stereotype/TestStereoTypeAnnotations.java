package com.myspring.core.advanced.autowire.annotation.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestStereoTypeAnnotations {

	/**
	 * Default Constructor
	 */
	public TestStereoTypeAnnotations() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/advanced/autowire/annotation/stereotype/stereotype-annotation-config.xml");

		BookStore bookStore = (BookStore) appContext.getBean("bookStore");
		System.out.println(bookStore);

		appContext.registerShutdownHook();
		appContext.close();
	}
}