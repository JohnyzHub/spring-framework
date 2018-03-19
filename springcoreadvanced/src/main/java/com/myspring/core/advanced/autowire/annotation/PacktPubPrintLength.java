package com.myspring.core.advanced.autowire.annotation;

/**
 * @author johnybasha
 *
 */
public class PacktPubPrintLength implements PrintLength {

	/**
	 * Default Constructor
	 */
	public PacktPubPrintLength() {
		super();
	}

	/*
	 * Number of Pages in a book.
	 * 
	 * @see com.myspring.core.advanced.autowire.annotation.PrintLength#printLength()
	 */
	@Override
	public int printLength() {
		return 670;
	}
}
