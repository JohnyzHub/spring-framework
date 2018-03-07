package com.myspring.core.springcore.set;

import java.util.Set;

/**
 * @author johnybasha
 *
 */
public class CarDealer {

	private String name;

	private Set<String> models;

	/**
	 * Default Constructor
	 */
	public CarDealer() {
		// TODO Auto-generated constructor stub
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

	/**
	 * @return the models
	 */
	public Set<String> getModels() {
		return models;
	}

	/**
	 * @param models
	 *            the models to set
	 */
	public void setModels(Set<String> models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "CarDealer [name=" + name + ", models=" + models + "]";
	}

}
