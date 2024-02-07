package com.example.binding;

public class UserNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotFound() {

	}

	public UserNotFound(String msg) {
		super(msg);
	}

}
