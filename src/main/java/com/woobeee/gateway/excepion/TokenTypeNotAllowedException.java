package com.woobeee.gateway.excepion;

public class TokenTypeNotAllowedException extends RuntimeException {
	public TokenTypeNotAllowedException(String message) {
		super(message);
	}
}
