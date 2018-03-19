package com.myspring.core.advanced.autowire.annotation.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author johnybasha
 *
 */

@Component
@Scope("prototype")
public class Address {

	private int houseNumber = 10;

	@Value("Creek Drive")
	private String streetName;

	@Value("#{new String('KentWood').toUpperCase()}")
	private String cityName = "Grand Rapids";

	/**
	 * Default Constructor
	 */
	public Address() {
		super();
	}

	/**
	 * Constructor with arguments.
	 * 
	 * @param houseNumber
	 * @param streetName
	 * @param cityName
	 */
	public Address(@Value("20") int houseNumber, @Value("Poplar Creek") String streetName,
			@Value("Lansing") String cityName) {
		super();
		System.out.println("Inside Address Constructor");
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.cityName = cityName;
	}

	/**
	 * Address in the string format.
	 */
	@Override
	public String toString() {
		return "\nAddress [houseNumber=" + houseNumber + ", streetName=" + streetName + ", cityName=" + cityName + "]";
	}
}