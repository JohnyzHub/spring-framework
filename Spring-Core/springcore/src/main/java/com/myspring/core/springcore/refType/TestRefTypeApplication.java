package com.myspring.core.springcore.refType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestRefTypeApplication {

	/**
	 * Default Constructor.
	 */
	public TestRefTypeApplication() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/myspring/core/springcore/refType/person-config.xml");
		Person person = (Person) appContext.getBean("person");
		System.out.println(person);

		Person innerPerson = (Person) appContext.getBean("InnerPerson");
		System.out.println(innerPerson);

		appContext.registerShutdownHook();
		appContext.close();
	}
}