package com.myspring.core.advanced.autowire.byname;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestAutoWireByNameApplication {

	/**
	 * Default Constructor.
	 */
	public TestAutoWireByNameApplication() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/advanced/autowire/byname/autowire-byname-config.xml");

		AccountHodler accountHolder = (AccountHodler) appContext.getBean("accountHolder");
		System.out.println(accountHolder);

		appContext.registerShutdownHook();
		appContext.close();
	}
}