package com.myspring.core.advanced.autowire.annotation;

/**
 * @author johnybasha
 *
 */
public class ApressPrintLength implements PrintLength {

	/**
	 * Default Constructor
	 */
	public ApressPrintLength() {
		super();
	}

	/*
	 * Number of Pages in a book.
	 * 
	 * @see com.myspring.core.advanced.autowire.annotation.PrintLength#printLength()
	 */
	@Override
	public int printLength() {
		return 849;
	}

}
