/**
 * 
 */
package com.myspring.core.springcore.list;

import java.util.List;

/**
 * @author johnybasha
 *
 */
public class Hospital {

	private String name;

	private List<String> departments;

	/**
	 * Default Constructor
	 */
	public Hospital() {
	}

	private void init() {
		System.out.println("Inside custom init method");
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
	 * @return the departments
	 */
	public List<String> getDepartments() {
		return departments;
	}

	/**
	 * @param departments
	 *            the departments to set
	 */
	public void setDepartments(List<String> departments) {
		System.out.println("Setting Departments for Hospital bean");
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", departments=" + departments + "]";
	}

	private void destroy() {
		System.out.println("Inside custom destroy method");
	}

}
