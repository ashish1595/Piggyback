package com.incentives.piggyback.notification.exception;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

public class PiggyException extends RuntimeException {

	private static final long serialVersionUID = -3774564054778726161L;

	public static final HttpStatus DEFAULT_HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;

	public static final String DEFAULT_MESSAGE = "Something Bad Happened!";

	private HttpStatus httpStatus;

	private String message;

	private ExceptionResponseCode responseCode;

	public ExceptionResponseCode getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(ExceptionResponseCode responseCode) {
		if(responseCode != null) {
			message = responseCode.getDescription();
		}else {
			message = DEFAULT_MESSAGE;
		}
		this.responseCode = responseCode;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PiggyException(HttpStatus httpStatus, String message) {
		super();
		this.httpStatus = httpStatus == null ? DEFAULT_HTTP_STATUS : httpStatus;
		this.message = StringUtils.isEmpty(message) ? DEFAULT_MESSAGE : message;
	}

	public PiggyException(String message) {
		this(DEFAULT_HTTP_STATUS, message);
	}

	public PiggyException() {
		this(DEFAULT_HTTP_STATUS, DEFAULT_MESSAGE);
	}

	public PiggyException(ExceptionResponseCode err) {
		super();
		this.setResponseCode(err);		
	}

	public PiggyException(ExceptionResponseCode err, String errorMessage) {
		super();
		this.responseCode = err;
		this.message = errorMessage;
	}

}
