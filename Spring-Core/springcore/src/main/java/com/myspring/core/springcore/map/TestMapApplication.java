package com.myspring.core.springcore.map;

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
		ClassPathXmlApplicationContext cartContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/map/cart-config.xml");

		Cart cart = (Cart) cartContext.getBean("cart");
		System.out.println(cart);

		cartContext.registerShutdownHook();
		cartContext.close();
	}
}