package org.santanubrains.hystrix.exception;

public class InternalErrorException extends RuntimeException {

	private static final long serialVersionUID = 6354303826163403006L;

	public InternalErrorException() {
		super("Internal error");

	}

}
