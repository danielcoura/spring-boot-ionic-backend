package com.danielcoura.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DataIntegrityException() {
	}
	
	public DataIntegrityException(String mensagem) {
		super(mensagem);
	}

	public DataIntegrityException(String mensagem, Throwable cause) {
		super(mensagem, cause);
	}

}
