package com.ceiba.domain.exception;

public class NoDataException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
    public NoDataException(String message) {
        super(message);
    }
}
