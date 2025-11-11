package com.app.savecity.error;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

	private HttpStatus stutas;
	private String message;
	
	
	public ErrorMessage() {
		super();
	}


	public ErrorMessage(HttpStatus stutas, String message) {
		super();
		this.stutas = stutas;
		this.message = message;
	}


	public HttpStatus getStutas() {
		return stutas;
	}


	public void setStutas(HttpStatus stutas) {
		this.stutas = stutas;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
