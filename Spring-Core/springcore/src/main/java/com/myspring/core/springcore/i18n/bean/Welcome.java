package com.myspring.core.springcore.i18n.bean;

/**
 * @author johnybasha
 *
 */
public class Welcome {

	private String greetings;

	/**
	 * Default Constructor
	 */
	public Welcome() {
		super();
	}

	public Welcome(String greetings) {
		this.greetings = greetings;
	}

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	@Override
	public String toString() {
		return "Welcome [greetings=" + greetings + "]";
	}
}