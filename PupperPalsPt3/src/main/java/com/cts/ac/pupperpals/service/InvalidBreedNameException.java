package com.cts.ac.pupperpals.service;

public class InvalidBreedNameException extends RuntimeException {
	
	public InvalidBreedNameException(String message) {
		super(message);
	}
	
	public InvalidBreedNameException(String message, Throwable cause) {
		super(message, cause);
	}

}
