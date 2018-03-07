package com.myspring.core.springcore.lc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author johnybasha
 *
 */
public class TicketReservation implements InitializingBean, DisposableBean {

	private int number;

	private String name;

	/**
	 * Default Constructor
	 */
	public TicketReservation() {
		System.out.println("Default Constructor: Called");
	}

	public TicketReservation(int number, String name) {
		this.setNumber(number);
		this.setName(name);
		System.out.println("Constructor with Args: Called");
	}

	@PostConstruct
	public void customInit() {
		System.out.println("@PostConstruct: Called");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("@PreDestroy: Called");
	}

	private void configInit() {
		System.out.println("Init through XML Config: Called");
	}

	protected void configDestroy() {
		System.out.println("Destroy through XML Config: Called");
	}

	void defaultInit() {
		System.out.println("Global Init: Called");
	}

	void defaultDestroy() {
		System.out.println("Global Destroy: Called");
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ticket with number=" + number + " reserved for " + name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable Bean: Called");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean: Called");

	}
}