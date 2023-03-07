package com.monocept.model;

public class CellAlreadyMarkedException extends RuntimeException {
private String message;

public CellAlreadyMarkedException(String message) {
	super(message);
	this.message = message;
}

@Override
public String getMessage() {
	return message;
}

@Override
public String toString() {
	return "CellAlreadyMarkedException [message=" + message + "]";
}


}
