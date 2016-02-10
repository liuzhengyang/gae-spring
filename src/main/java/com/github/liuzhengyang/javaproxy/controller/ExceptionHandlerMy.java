package com.github.liuzhengyang.javaproxy.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 *
 * @author liuzhengyang
 * @version 1.0
 * @since 2016-02-10
 */
@ControllerAdvice
public class ExceptionHandlerMy {
	@ExceptionHandler
	public ResponseEntity<String> handle(Exception exception, HttpServletRequest requestMain) {
		String erro = exception.getMessage();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<String>(exception.getMessage(), headers, HttpStatus.FORBIDDEN);
	}
}
