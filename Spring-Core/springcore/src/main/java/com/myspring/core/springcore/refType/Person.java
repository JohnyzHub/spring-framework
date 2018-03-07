package com.myspring.core.springcore.refType;

/**
 * @author johnybasha
 *
 */
public class Person {

	private Passport passport;

	/**
	 * Default Constructor
	 */
	public Person() {
		super();
	}

	/**
	 * @return the passport
	 */
	public Passport getPassport() {
		return passport;
	}

	/**
	 * @param passport
	 *            the passport to set
	 */
	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [passport=" + passport + "]";
	}
}