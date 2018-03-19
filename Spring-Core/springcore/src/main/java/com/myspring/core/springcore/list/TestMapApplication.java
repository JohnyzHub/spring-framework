package com.myspring.core.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestMapApplication {

	/**
	 * Default Constructor.
	 */
	public TestMapApplication() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/list/list-config.xml");

		Hospital hospital1 = (Hospital) appContext.getBean("hospital1");
		System.out.println(hospital1);

		Hospital hospital2 = (Hospital) appContext.getBean("hospital2");
		System.out.println(hospital2);

		appContext.registerShutdownHook();
		appContext.close();
	}
}