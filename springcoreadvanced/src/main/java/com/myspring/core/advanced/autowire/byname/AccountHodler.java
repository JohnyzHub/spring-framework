package com.myspring.core.advanced.autowire.byname;

/**
 * @author johnybasha
 *
 */
public class AccountHodler {

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
	public AccountHodler(Address address) {
		System.out.println("Inside Constructor");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Inside setAddress");
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nAccountHodler [address=" + address + "]\n";
	}

}