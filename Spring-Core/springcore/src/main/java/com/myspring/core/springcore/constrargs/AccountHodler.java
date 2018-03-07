package com.myspring.core.springcore.constrargs;

/**
 * @author johnybasha
 *
 */
public class AccountHodler {

	private String name;

	private Address address;

	/**
	 * Default Constructor
	 */
	public AccountHodler() {
		super();
	}

	/**
	 * Consrucotr with Arguments.
	 * 
	 * @param name
	 * @param address
	 */
	public AccountHodler(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nAccountHodler [name=" + name + ", address=" + address + "]\n";
	}
}