package com.exception;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 8251584800543792438L;

	public UserNotFoundException(String errorMsg) {
        super(errorMsg);
    }
	
}
