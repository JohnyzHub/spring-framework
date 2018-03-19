/**
 * 
 */
package com.myspring.core.advanced.autowire.annotation;

/**
 * @author johnybasha
 *
 */
public class PacktPub implements BookPublisher {

	private String name;

	/**
	 * Default Constructor
	 */
	public PacktPub() {
		super();
	}

	public PacktPub(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "PacktPub [name=" + name + "]";
	}
}