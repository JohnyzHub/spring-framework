package com.myspring.core.springcore.refType;

/**
 * @author johnybasha
 *
 */
public class Passport {

	private long number;

	/**
	 * Default Constructor.
	 */
	public Passport() {
		super();
	}

	/**
	 * @return the number
	 */
	public long getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Passport [number=" + number + "]";
	}
}