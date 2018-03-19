package com.myspring.core.advanced.autowire.annotation;

/**
 * @author johnybasha
 *
 */
public class Review {

	private String comment;

	/**
	 * Default Constructor
	 */
	public Review() {
		super();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "[" + comment + "]";
	}
}