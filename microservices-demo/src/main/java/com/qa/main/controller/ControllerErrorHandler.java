package com.qa.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerErrorHandler {
	@ExceptionHandler(Exception.class)
   public ResponseEntity<ErrorResponse> handlerError(Exception e){
	   
	   ErrorResponse errorResponse = new ErrorResponse();
	   errorResponse.setReasonCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
	   errorResponse.setErrorMessage(e.getMessage());
	   
	   return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
   }
}
