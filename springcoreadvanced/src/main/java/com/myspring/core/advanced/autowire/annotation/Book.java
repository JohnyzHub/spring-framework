package com.myspring.core.advanced.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author johnybasha
 *
 */
public class Book {

	private BookPublisher publisher;

	private BookPrice price;

	private Review comment;

	@Autowired
	@Qualifier("apressSize")
	private PrintLength printLength;

	/**
	 * Default Constructor
	 */
	public Book() {
		super();
		System.out.println("Book: Inside Default Constructor");
	}

	@Autowired(required = true)
	public Book(@Qualifier("aPress") BookPublisher name, @Qualifier("paperBack") BookPrice bookPrice) {
		super();
		this.publisher = name;
		this.price = bookPrice;
		System.out.println("Book: Inside Constructor");
	}

	public Review getReview() {
		return comment;
	}

	@Autowired(required = false)
	public void setReview(Review Review) {
		System.out.println("Book: Inside setReview");
		this.comment = Review;
	}

	@Override
	public String toString() {
		return "Book [publisher=" + publisher + ", format=" + price + ", comment=" + comment + ", printLength="
				+ printLength.printLength() + "]";
	}
}