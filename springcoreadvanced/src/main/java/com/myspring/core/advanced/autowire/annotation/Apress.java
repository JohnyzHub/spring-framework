/**
 * 
 */
package com.myspring.core.advanced.autowire.annotation;

/**
 * @author johnybasha
 *
 */
public class Apress implements BookPublisher {

	private String name;

	/**
	 * Default Constructor
	 */
	public Apress() {
		super();
	}

	public Apress(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Apress [name=" + name + "]";
	}
}