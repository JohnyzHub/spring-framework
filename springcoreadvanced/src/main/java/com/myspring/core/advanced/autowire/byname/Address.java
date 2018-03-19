package com.myspring.core.advanced.autowire.byname;

/**
 * @author johnybasha
 *
 */
public class Address {

	private int houseNbr;

	private String streetName;

	/**
	 * 
	 */
	public Address() {
		super();
	}

	public Address(int houseNbr, String streetName) {
		super();
		this.houseNbr = houseNbr;
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "Address [houseNbr=" + houseNbr + ", streetName=" + streetName + "]";
	}
}