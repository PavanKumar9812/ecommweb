package com.abc.ecomm.exception;

public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}