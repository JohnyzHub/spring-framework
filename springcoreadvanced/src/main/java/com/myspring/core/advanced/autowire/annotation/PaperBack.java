/**
 * 
 */
package com.myspring.core.advanced.autowire.annotation;

/**
 * @author johnybasha
 *
 */
public class PaperBack implements BookPrice {

	private double price;

	/**
	 * Default Constructor
	 */
	public PaperBack() {
		super();
	}

	public PaperBack(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PaperBack [price=" + price + "]";
	}
}