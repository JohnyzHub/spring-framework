package com.myspring.core.springcore.constrargs;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestConstrArgsApplication {

	/**
	 * Default Constructor.
	 */
	public TestConstrArgsApplication() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/constrargs/constrargs-config.xml");

		AccountHodler accountHolder1 = (AccountHodler) appContext.getBean("accountHolder1");
		System.out.println(accountHolder1);

		AccountHodler accountHolder2 = (AccountHodler) appContext.getBean("accountHolder2");
		System.out.println(accountHolder2);

		appContext.registerShutdownHook();
		appContext.close();
	}
}