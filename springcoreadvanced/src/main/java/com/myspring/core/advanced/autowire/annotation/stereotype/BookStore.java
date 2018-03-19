package com.myspring.core.advanced.autowire.annotation.stereotype;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author johnybasha
 *
 */
@Component("bookStore")
@Scope("singleton")
public class BookStore {

	@Value("1")
	private int storeNumber;

	@Autowired(required = true)
	private Address storeAddress;

	@Value("#{books}")
	private Set<String> books;

	/**
	 * Default Constructor
	 */
	public BookStore() {
		super();
	}

	@Override
	public String toString() {
		return "BookStore [storeNumber=" + storeNumber + ", storeAddress=" + storeAddress + ", \nbooks=" + books + "]";
	}

}
