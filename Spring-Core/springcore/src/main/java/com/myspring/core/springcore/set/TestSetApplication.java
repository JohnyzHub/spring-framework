package com.myspring.core.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestSetApplication {

	/**
	 * Default Constructor.
	 */
	public TestSetApplication() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/set/cardealer-config.xml");
		CarDealer carDealer = (CarDealer) appContext.getBean("carDealer");
		System.out.println(carDealer);
		appContext.close();
	}
}