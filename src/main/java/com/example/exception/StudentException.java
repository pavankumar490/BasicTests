package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentException extends RuntimeException {

	public StudentException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

}
