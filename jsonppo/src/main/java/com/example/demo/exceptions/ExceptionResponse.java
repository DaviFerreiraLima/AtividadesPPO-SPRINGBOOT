package com.example.demo.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String mensagemString;
	private String details;
	
	public ExceptionResponse(Date timestamp, String mensagemString, String details) {
		this.timestamp = timestamp;
		this.mensagemString = mensagemString;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMensagemString() {
		return mensagemString;
	}

	public String getDetails() {
		return details;
	}
	
	
}
