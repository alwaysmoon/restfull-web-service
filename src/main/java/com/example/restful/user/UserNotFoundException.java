package com.example.restful.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//HTTP Status code
//2XX -> OK
//4XX -> Client
//5XX -> Server
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {
	public UserNotFoundException(String message) {
		super(message);
	}
}
