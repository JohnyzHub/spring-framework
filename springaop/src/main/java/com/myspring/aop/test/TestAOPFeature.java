package com.myspring.aop.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myspring.aop.Calculator;

/**
 * @author johnybasha
 *
 */
public class TestAOPFeature {

	/**
	 * Default Constructor
	 */
	public TestAOPFeature() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/aop/aop-feature-config.xml");
		System.out.println("");
		Calculator calculator = (Calculator) appContext.getBean("calculator");
		calculator.squareOf(5);
		System.out.println("");

		ScientificCalculator sciCalc = (ScientificCalculator) appContext.getBean("scientificCalculator");
		sciCalc.multiply(2, 3);
		System.out.println("");
		sciCalc.additionOf(4, 5);

		appContext.registerShutdownHook();
		appContext.close();

	}
}