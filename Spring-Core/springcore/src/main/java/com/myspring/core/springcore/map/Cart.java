package com.myspring.core.springcore.map;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author johnybasha
 *
 */
public class Cart {

	private int id;

	private Map<String, Integer> items;

	/**
	 * Default Constructor.
	 */
	public Cart() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		System.out.println("Setting id to the bean");
		this.id = id;
	}

	/**
	 * @return the items
	 */
	public Map<String, Integer> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(Map<String, Integer> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", items=" + items + "]";
	}

	@PostConstruct
	private void customInit() {
		System.out.println("Invoking postConstruct()");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("Invoking preDestroy()");
	}
}