package com.myspring.core.springcore.lc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestLifeCycleApplication {

	/**
	 * Default Constructor.
	 */
	public TestLifeCycleApplication() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/lc/lifecycle-config.xml");

		TicketReservation reservation1 = (TicketReservation) appContext.getBean("reservation1");
		System.out.println(reservation1);

		appContext.registerShutdownHook();
		appContext.close();
	}
}