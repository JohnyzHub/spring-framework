/**
 * 
 */
package com.myspring.core.advanced.autowire.annotation;

/**
 * @author johnybasha
 *
 */
public class EBook implements BookPrice {

	private double price;

	/**
	 * Default Constructor
	 */
	public EBook() {
		super();
	}

	public EBook(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nEBook [price=" + price + "]\n";
	}
}