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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/list/list-config.xml");

		Hospital hospital = (Hospital) appContext.getBean("hospital");
		System.out.println(hospital);

		appContext.registerShutdownHook();
		appContext.close();
	}
}