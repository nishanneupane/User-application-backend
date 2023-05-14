package com.hotel.user.exception;

public class ResourceNotFoundException extends RuntimeException{
	public ResourceNotFoundException() {
		super("Resource not fund on server");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
