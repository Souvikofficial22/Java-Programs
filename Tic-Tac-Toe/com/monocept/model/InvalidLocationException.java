package com.monocept.model;

public class InvalidLocationException extends RuntimeException {

	private String message;
	public InvalidLocationException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidLocationException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return "InvalidLocationException [message=" + message + "]";
	}

	
}
