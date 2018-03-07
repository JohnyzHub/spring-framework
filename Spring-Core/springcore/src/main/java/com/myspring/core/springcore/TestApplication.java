package com.myspring.core.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnybasha
 *
 */
public class TestApplication {

	/**
	 * Default Constructor.
	 */
	public TestApplication() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("employee-config.xml");
		Employee employee1 = (Employee) appContext.getBean("emp1");
		System.out.println(employee1);

		Employee employee1Dup = (Employee) appContext.getBean("emp1");
		System.out.println(employee1Dup);

		long employee1Hash = employee1.hashCode();
		long employee1DupHash = employee1Dup.hashCode();
		boolean areSingletonEqual = (employee1Hash == employee1DupHash);

		System.out.println("Singleton(Default) Scope : \n\tEmployee1: " + employee1Hash + "\n\tDuplicate Employee: "
				+ employee1DupHash + " \n\tare Equal: " + areSingletonEqual + "\n");

		Employee employee2 = (Employee) appContext.getBean("emp2");
		System.out.println(employee2);

		Employee employee2Dup = (Employee) appContext.getBean("emp2");
		System.out.println(employee2Dup);

		long employee2Hash = employee2.hashCode();
		long employee2DupHash = employee2Dup.hashCode();
		boolean arePrototypeEqual = (employee2Hash == employee2DupHash);

		System.out.println("Prototype Scope : \n\tEmployee2: " + employee2Hash + "\n\tDuplicate Employee2: "
				+ employee2DupHash + " \n\tare Equal: " + arePrototypeEqual);

		appContext.registerShutdownHook();
		appContext.close();
	}
}