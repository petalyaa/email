package com.pet.email.generic.exception;

public class MainAppException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public MainAppException() {
		super();
	}
	
	public MainAppException(String msg) {
		super(msg);
	}
	
	public MainAppException(String msg, Throwable tw) {
		super(msg, tw);
	}

}
