/**
 * 
 */
package com.myspring.aop.test;

import com.myspring.aop.Calculator;

/**
 * @author johnybasha
 *
 */
public class ScientificCalculator extends Calculator {

	/**
	 * Default Constructor
	 */
	public ScientificCalculator() {
		super();
	}

	protected int multiply(int x, int y) {
		System.out.println("Inside protected Multiply Of : " + (x * y));
		return x * y;
	}

}
