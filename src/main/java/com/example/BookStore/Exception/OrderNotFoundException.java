package com.example.BookStore.Exception;

@SuppressWarnings("serial")
public class OrderNotFoundException extends RuntimeException {

	public OrderNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrderNotFoundException(String message) {
		super(message);
	}

	public OrderNotFoundException(Throwable cause) {
		super(cause);
	}

}
