package com.arquitechthor.inditest.infrastructure.adapter.out.exception;

import java.time.LocalDateTime;

import lombok.Builder;

@Builder
public class ErrorMessage {
	
	private int statusCode;
	private LocalDateTime timestamp;
	private String message;
	private String description;

	public ErrorMessage(int statusCode, LocalDateTime timestamp, String message, String description) {
	    this.statusCode = statusCode;
	    this.timestamp = timestamp;
	    this.message = message;
	    this.description = description;
	}

	public int getStatusCode() {
	    return statusCode;
	}

	public LocalDateTime getTimestamp() {
	    return timestamp;
	}

	public String getMessage() {
	    return message;
	}

	public String getDescription() {
	    return description;
	}
}
