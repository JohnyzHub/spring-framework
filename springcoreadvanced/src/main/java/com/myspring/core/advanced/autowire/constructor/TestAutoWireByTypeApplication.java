package com.myspring.core.advanced.autowire.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myspring.core.advanced.autowire.byname.AccountHodler;

/**
 * @author johnybasha
 *
 */
public class TestAutoWireByTypeApplication {

	/**
	 * Default Constructor.
	 */
	public TestAutoWireByTypeApplication() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/advanced/autowire/constructor/autowire-constructor-config.xml");

		AccountHodler accountHolder = (AccountHodler) appContext.getBean("accountHolder");
		System.out.println(accountHolder);

		appContext.registerShutdownHook();
		appContext.close();
	}
}