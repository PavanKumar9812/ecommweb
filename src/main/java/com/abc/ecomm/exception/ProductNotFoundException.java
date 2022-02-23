package com.abc.ecomm.exception;

public class ProductNotFoundException extends RuntimeException {

	public ProductNotFoundException(String msg) {
		super(msg);
	}
}
