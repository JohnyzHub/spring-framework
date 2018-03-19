package com.myspring.aop;

/**
 * @author johnybasha
 *
 */
public class Calculator {

	/**
	 * Default Constructor
	 */
	public Calculator() {
		super();
	}

	public int squareOf(int x) {
		System.out.println("Inside public squareOf : " + (x * x));
		return x * x;
	}

	private int addition(int x, int y) {
		System.out.println("Inside private method - addition : " + (x + y));
		return x + y;
	}

	public int additionOf(int x, int y) {
		return addition(x, y);
	}

	@Override
	public String toString() {
		return "Inside Calculator Class.";
	}

}
