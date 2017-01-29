package com.budofa.store.model;

public class StoreServerException extends RuntimeException {

	private static final long serialVersionUID = 8556652961367862025L;
	private String exceptionMessage;

	public StoreServerException(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
}
