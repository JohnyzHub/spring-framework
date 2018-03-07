package com.myspring.core.springcore.i18n;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestDataSourceProperties {

	/**
	 * Default Constructor.
	 */
	public TestDataSourceProperties() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/i18n/datasource-config.xml");

		DataSourceObject dataSourceObject = (DataSourceObject) appContext.getBean("dataSource");
		System.out.println(dataSourceObject);

		appContext.registerShutdownHook();
		appContext.close();
	}
}