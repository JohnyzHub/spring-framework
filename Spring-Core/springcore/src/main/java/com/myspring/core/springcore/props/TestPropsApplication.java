package com.myspring.core.springcore.props;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestPropsApplication {

	/**
	 * Default Constructor.
	 */
	public TestPropsApplication() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/props/tabletpcs-config.xml");

		TabletPcs tabletPcs = (TabletPcs) appContext.getBean("tabletPcs");
		System.out.println(tabletPcs);

		appContext.registerShutdownHook();
		appContext.close();
	}
}