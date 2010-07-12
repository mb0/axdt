package org.axdt.avm.access;

public class DefinitionNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DefinitionNotFoundException() {
		super();
	}

	public DefinitionNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public DefinitionNotFoundException(String message) {
		super(message);
	}

	public DefinitionNotFoundException(Throwable cause) {
		super(cause);
	}
}
